package amazon.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import amazon.util.TestUtil;
import amazon.util.WebEventListener;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public TestBase(){
		try{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:/Users/Raj/workspace/AmazonTest/src/main/java/amazon/config/config.properties");
			prop.load(ip);
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void intialization(){
		String BrowserName = prop.getProperty("Browser");
		if(BrowserName.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "F:/AnotherPc/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
		}else if (BrowserName.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", "F:/AnotherPc/chromedriver_win32/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		e_driver = new EventFiringWebDriver(driver);
		//now Create Object of EventListenerHandler to register it with EventFirigWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver=e_driver;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT_TIMEOUT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	
	

}
