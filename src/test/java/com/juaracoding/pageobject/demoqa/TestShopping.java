package com.juaracoding.pageobject.demoqa;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

//import com.juaracoding.pageobject.demoqa.Hooks;
import com.juaracoding.pageobject.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestShopping {
	
	public static WebDriver driver;
	private static ExtentTest extentTest;
	private ShoppingDemoqa shoppingDemoqa = new ShoppingDemoqa();
	
	public TestShopping() {
		driver = Hooks .driver;
		extentTest = Hooks.extentTest;
	}
	
//	scenario 1
	@When("user go to shop web")
	public void user_go_to_shop_web() {
		driver .get(Constants.URLSHOP);
		extentTest.log(LogStatus.PASS, "user go to shop web");
	}
	
	@Then("user enter button search")
	public void user_enter_button_search() {
		shoppingDemoqa.clickSearch();
		extentTest.log(LogStatus.PASS, "user enter button search");
	}
	
	@And("user search product one")
	public void user_search_product_one() {
		shoppingDemoqa.txtSearch("");
		scroll(500);
		shoppingDemoqa.clickDress();
		extentTest.log(LogStatus.PASS, "user search product one");
	}
	
	@And("user search product two")
	public void user_search_product_two() {
		shoppingDemoqa.clickSearch();
		scroll(500);
		shoppingDemoqa.txtSearch1("");
		extentTest.log(LogStatus.PASS, "user search product two");
	}

	
//scenario 2
//	scenario 2
	@And("user click product shirt")
	public void user_click_product_shirt() {
		driver.navigate().to("https://shop.demoqa.com/?s=shirt&post_type=product");
		scroll(500);
		shoppingDemoqa.clickShirt();
		scroll(300);
		extentTest.log(LogStatus.PASS, "user click product shirt");
	}
	
	@And("add to cart")
	public void add_to_cart() {
		shoppingDemoqa.addCart();
		shoppingDemoqa.clickBtnCart();
		extentTest.log(LogStatus.PASS, "add to cart");
	}
	
	@And("user click tab checkout")
	public void user_click_tab_checkout() {
//		driver .get(Constants.URLSHOP);
		shoppingDemoqa.clickBtnCheckout();
		scroll(300);
		extentTest.log(LogStatus.PASS, "user click tab checkout");
	}
	
	@And("fill out the form")
	public void fill_out_the_form() {
		shoppingDemoqa.data();
		delay(3);
		shoppingDemoqa.clickTerms();
		extentTest.log(LogStatus.PASS, "fill out the form");
	}
	
	@Then("click button place order")
	public void click_button_place_order() {
		shoppingDemoqa.clickPlaceOrder();
		driver.navigate().refresh();
		assertEquals(shoppingDemoqa.getTxtCheckoutPage(), "CHECKOU");
		extentTest.log(LogStatus.PASS, "click button place order");
	}
		

	static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + vertical + ")");
	}
	
	public static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
