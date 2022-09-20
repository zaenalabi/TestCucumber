package com.juaracoding.pageobject.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class RegisterDemoqa {
	
	private WebDriver driver;
	
	public RegisterDemoqa() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//*[@id='reg_username']")
	private WebElement username1;
	
	@FindBy(xpath = "//*[@id='reg_email']")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id='reg_password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@name='register']")
	private WebElement btnRegist;
	
	
	public void regist(String username1, String email, String password) {
		this.username1.sendKeys(username1);
		this.email.sendKeys(email);
		this.password.sendKeys(password);
		btnRegist.click(); 
	}
	
}
	

