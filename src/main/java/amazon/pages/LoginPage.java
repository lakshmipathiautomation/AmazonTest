package amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazon.base.TestBase;

public class LoginPage extends TestBase {
	
	//page object repository :
	@FindBy(xpath ="//span[@class='nav-line-3']")
	WebElement SigninBtn ;
	
	@FindBy(name="email")
	WebElement phone;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement next;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement Login;
	
	@FindBy(xpath="//span[@class='nav-sprite nav-logo-base']")
	WebElement amazonlogo;
	
	@FindBy(xpath="//a[@id='nav-cart']")
	WebElement navcart;
	//Intializing the page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	//Actions
	public void SigninBtn(){
		SigninBtn.click();
	}
	public void LogIn(String un){
		phone.sendKeys(un);
	}
	public void NextClick(){
		next.click();
	}
	public void SignIn(){
		Login.click();
	}
	
	public HomePage LogInPas(String pwd){
		password.sendKeys(pwd);
		Login.click();
		return new HomePage();
	}
	public String ValidateAmazonLoginTitle(){
		return driver.getTitle();
	}
	public boolean ValidateAmazonLogo(){
		return amazonlogo.isDisplayed();
	}
	public void MyLoginData(){
		
	}
	

}
