package amazon.util;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import amazon.base.TestBase;

public class WebEventListener extends TestBase implements WebDriverEventListener {

	public void beforeNavigateTo(String url, WebDriver driver) {
	System.out.println("Before Navigating to:'"+url+"'");
		
	}
   public void afterNavigateTo(String url, WebDriver driver) {
		
		System.out.println("Navigated to:'"+url+"'");
	}
   public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		System.out.println("Value Of The :"+element.toString()+"before any Changes Made");
	}
   public void afterChangeValueOf(WebElement element, WebDriver driver) {
		System.out.println("Element Value Change to:"+element.toString());
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Trying To Click On:"+element.toString());		
	}
	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("Clicked On:"+element.toString());		
	}
	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("Navigating Back to Previous Page");		
	}
	public void afterNavigateBack(WebDriver driver) {
		System.out.println("Navigated Back To Previous Page");		
	}
	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("Navigating Forward To Next Page");		
	}
	public void afterNavigateForward(WebDriver driver) {
		System.out.println("Navigated Forward To Next Page");		
	}
	public void onException(Throwable error, WebDriver driver) {
		System.out.println("Expception Occured:"+error);		
	}
//	try{
//		takeScreenshotAtEndOfTest();
//	}catch(IOException e){
//		c.printStack Trace();
//	}
//}
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Trying To Find Element By:"+by.toString());
		
	}
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Found Element By:"+by.toString());
	}
	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] c) {
		// TODO Auto-generated method stub
		
	}
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] c) {
		// TODO Auto-generated method stub
		
	}
	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		// TODO Auto-generated method stub
		
	}

	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}
	

	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	

	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	

	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	

}
