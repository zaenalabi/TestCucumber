package com.juaracoding.pageobject.demoqa.main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.pageobject.demoqa.LoginDemoqa;
import com.juaracoding.pageobject.demoqa.RegisterDemoqa;
import com.juaracoding.pageobject.drivers.DriverSingleton;

public class MainDemoqa {

	public static void main(String[] args)throws InterruptedException {
		
		DriverSingleton.getInstance("Chrome");
		WebDriver driver = DriverSingleton.getDriver();
		String url = "https://shop.demoqa.com/my-account/";
		driver.get(url);
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		LoginDemoqa loginDemoqa = new LoginDemoqa();
		loginDemoqa.login("Nurul", "Nurul123");
		System.out.println("Login Gagal, Silahkan coba lagi");
		Thread.sleep(1000);
		
		RegisterDemoqa registDemoqa = new RegisterDemoqa();
		registDemoqa.regist("Nurul Pj", "fajriantynurul99@gmail.com", "Qwerty@99");
		System.out.println("Selamat, Akun berhasil dibuat");
		Thread.sleep(1000);
		
		delay(5);
		driver.quit();

	}
	
	static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}

