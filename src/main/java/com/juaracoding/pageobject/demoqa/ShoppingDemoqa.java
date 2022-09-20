package com.juaracoding.pageobject.demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.juaracoding.pageobject.drivers.DriverSingleton;

public class ShoppingDemoqa {
	
private WebDriver driver;
	
	public ShoppingDemoqa () {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	search
	@FindBy(xpath = "//a[@class='noo-search']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//label[@class='note-search']")
	private WebElement txtTitleSearch;
	
	@FindBy(xpath = "//input[@name='s']")
	private WebElement search;
	
	@FindBy(xpath = "//input[@type='search']")
	private WebElement inputSearch;

	
//	SEARCH 1
	@FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[1]/div")
	private WebElement dress;
	
//	search 2
	@FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[1]/div")
	private WebElement shirt;

//	klik product
	@FindBy(xpath = "//select[@id='pa_color']")
	private WebElement pilihColor;
	
	@FindBy(xpath = "//select[@id='pa_size']")
	private WebElement pilihSize;
	
	@FindBy(xpath = "//button[normalize-space()='Add to cart']")
	private WebElement btnAddCart;
	
	@FindBy(xpath = "//*[@id='nav-menu-item-cart']/a")
	private WebElement btnCart;
	
//	CheckoutFitur
	@FindBy(xpath = "//*[@id='post-6']/div/div/div[2]/div[2]/div/a")
	private WebElement btnCheckout;
	
	@FindBy(xpath = "//h1[@class='page-title']")
	private WebElement txtCheckoutPage;

//	Data Place Order
	@FindBy(xpath = "//input[@id='billing_first_name']")
	private WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@id='billing_last_name']")
	private WebElement txtLastName;
	
	@FindBy(xpath = "//input[@id='billing_company']")
	private WebElement txtCompany;
	
	@FindBy(xpath = "//select[@id='billing_country']")
	private WebElement pilihNegara;
	
	@FindBy(xpath = "//input[@id='billing_address_1']")
	private WebElement txtAddress;
	
	@FindBy(xpath = "//input[@id='billing_city']")
	private WebElement txtKota;
	
	@FindBy(xpath = "//select[@id='billing_state']")
	private WebElement pilihProvinsi;
	
	@FindBy(xpath = "//input[@id='billing_postcode']")
	private WebElement txtPostcode;
	
	@FindBy(xpath = "//input[@id='billing_phone']")
	private WebElement txtTelpon;
	
	@FindBy(xpath = "//input[@id='billing_email']")
	private WebElement txtEmail;
	
	@FindBy(xpath = "//*[@id='terms']")
	private WebElement terms;
	
	@FindBy(xpath = "//button[@id='place_order']")
	private WebElement btnPlaceOrder;
	
	
	public void txtSearch(String search) {
		this.search.sendKeys("DRESS" + "\n"); //step 
	}
	
	public void txtSearch1(String search) {
		this.search.sendKeys("SHIRT" + "\n"); //step 
	}
	
	public String getTitleSearch() {
		return txtTitleSearch.getText();
	}
	
	public void clickSearch() {
		btnSearch.click();
	}
	
	public void clickShirt() {
		shirt.click();
	}
	
	public void clickDress() {
		dress.click();
	}
	
	public void addCart() {
		Select select = new Select(pilihColor);
		select.selectByValue("pink");
		pilihColor.click();
		Select selectOne = new Select(pilihSize);
		selectOne.selectByValue("36");
		pilihSize.click();
		btnAddCart.click();
	}
	
	public void clickBtnCart() {
		btnCart.click();
	}
	
	public void clickBtnCheckout() {
		btnCheckout.click();
	}
	
	public String getTxtCheckoutPage() {
		return txtCheckoutPage.getText();
	}
	
	public void data () {
		this.txtFirstName.sendKeys("Nurul");
		this.txtLastName.sendKeys("Fajrianty");
		System.out.println("Nama : Nurul Fajrianty");
		this.txtCompany.sendKeys("PT DIKA");
		System.out.println("Company : PT DIKA");
		Select negara = new Select(pilihNegara);
		negara.selectByValue("ID");
		System.out.println("Country : Indonesia");
		this.txtAddress.sendKeys("Premier Serenity Blok S.29");
		System.out.println("Address : Premier Serenity Blok S.29");
		this.txtKota.sendKeys("Bekasi");
		System.out.println("City : Bekasi");
		Select provinsi = new Select(pilihProvinsi);
		provinsi.selectByValue("JB");
		System.out.println("Province : Jawa Barat");
		this.txtPostcode.sendKeys("17112");
		System.out.println("Post Code : 17112");
		this.txtTelpon.sendKeys("081906753073");
		System.out.println("No. Telphone : 081906753073");
		this.txtEmail.sendKeys("fajriantynurul99@gmail.com");
		System.out.println("Email : fajriantynurul99@gmail.com");
//		terms.click();
//		btnPlaceOrder.click();
	}
	
	public void clickTerms() {
		terms.click();
	}
	
	public void clickPlaceOrder() {
		btnPlaceOrder.click();
	}


}
