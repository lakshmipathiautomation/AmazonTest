package amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazon.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[contains(text(),'Hello, KANTIPALLI')]")
	WebElement mynameCheck;
	@FindBy(xpath="//span[@id='a-autoid-0']//input[@class='a-button-input']")
	WebElement yourorder;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchkeys;
	
	@FindBy(xpath="//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")
	WebElement searchbtn;
	
	@FindBy(xpath="//a[@id='nav-orders']")
	WebElement returnsandorders;
	
	@FindBy(xpath="//a[@id='nav-cart']")
	WebElement amazoncart;
	
	@FindBy(xpath="//a[contains(text(),'Amazon Pay')]")
	WebElement AmazonPay;
	
	@FindBy(xpath="//a[contains(text(),'Mobiles')]")
	WebElement Mobiles;
	@FindBy(xpath="//span[@class='onep-instrument-header-desktop']")
	WebElement amazonpaytext;
//initializing the object repository;
public HomePage(){
	PageFactory.initElements(driver, this);
}
public boolean MynameCheck(){
	return mynameCheck.isDisplayed();
}
public boolean ValidateTitle(){
	return amazonpaytext.isDisplayed();
}
public SearchPage SearchKeys(String keys){
	searchkeys.sendKeys(keys);
	searchbtn.click();
	return new SearchPage();
}
public ReturnsAndOrdersPage ReturnsAndOrders(){
	returnsandorders.click();
	boolean b=yourorder.isEnabled();
	System.out.println(b);
	return new ReturnsAndOrdersPage();
	
}
public AmazonPayPage AmazonPayPage(){
	AmazonPay.click();
	driver.getTitle();
	return new AmazonPayPage();
}
public CartPage AmazonCartPage(){
	amazoncart.click();
	return new CartPage();
}
public MobilesPage MobilesPage(){
	Mobiles.click();
	return MobilesPage();
	
   }
}