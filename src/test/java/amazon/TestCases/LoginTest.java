package amazon.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazon.base.TestBase;
import amazon.pages.HomePage;
import amazon.pages.LoginPage;

public class LoginTest extends TestBase{
	LoginPage LogInPage;
    HomePage homepage;
 public LoginTest(){
	 super();
 }
	
	@BeforeMethod
	public void setUp(){
		intialization();
		LogInPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title=LogInPage.ValidateAmazonLoginTitle();
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		}
	
	@Test(priority=2)
	public void LogInTest(){
		LogInPage.SigninBtn();
		LogInPage.LogIn(prop.getProperty("username"));
		LogInPage.NextClick();
		homepage = LogInPage.LogInPas(prop.getProperty("password"));
		
	}
	@Test(priority=3)
	public void amazonLogoImageTest(){
		boolean flag = LogInPage.ValidateAmazonLogo();
		Assert.assertTrue(flag);
		}	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
	
	
	
	
}
