package amazon.TestCases;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazon.base.TestBase;
import amazon.pages.AmazonPayPage;
import amazon.pages.CartPage;
import amazon.pages.HomePage;
import amazon.pages.LoginPage;
import amazon.pages.MobilesPage;
import amazon.pages.ReturnsAndOrdersPage;
import amazon.pages.SearchPage;

public class HomePageTest extends TestBase {
	LoginPage LogInPage;
    HomePage homepage;
    MobilesPage mobilepage;
    SearchPage searchpage;
    ReturnsAndOrdersPage orderspage;
    CartPage cart;
    AmazonPayPage AmazonPay; 
    
 public HomePageTest(){
	 super();
 }
	
	@BeforeMethod
	public void setUp(){
		intialization();
		LogInPage = new LoginPage();
		mobilepage = new MobilesPage();
		searchpage= new SearchPage();
		orderspage =new ReturnsAndOrdersPage();
		cart = new CartPage();
	
		}
    @Test(priority=1)
    public void AmazonPayPageTest(){
    	LogInPage.SigninBtn();
		LogInPage.LogIn(prop.getProperty("username"));
		LogInPage.NextClick();
		homepage = LogInPage.LogInPas(prop.getProperty("password"));
    	AmazonPay=homepage.AmazonPayPage();
        Assert.assertTrue(homepage.ValidateTitle());
    }
    @Test(priority=2)
    public void SearchPageTest(){
    	LogInPage.SigninBtn();
		LogInPage.LogIn(prop.getProperty("username"));
		LogInPage.NextClick();
		homepage = LogInPage.LogInPas(prop.getProperty("password"));
    	homepage.SearchKeys("one plus 7 pro");
    	String title=driver.getTitle();
    	System.out.println(title);
    }
    @Test(priority=3)
    public void ReturnsAndOrdersTest(){
    	LogInPage.SigninBtn();
		LogInPage.LogIn(prop.getProperty("username"));
		LogInPage.NextClick();
		homepage = LogInPage.LogInPas(prop.getProperty("password"));
    	orderspage = homepage.ReturnsAndOrders();
    }
	@AfterMethod
	public void TearDown(){
		driver.quit();
	}
}
