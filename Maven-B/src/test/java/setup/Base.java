package setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe") ;	
	    WebDriver driver = new ChromeDriver() ;
		return driver;
		
	}	
	
    public WebDriver openFirefoxBrowser() {
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe") ;	
	    WebDriver driver = new FirefoxDriver() ;  
	    return driver ;
		
	
    	
	}	
		




}
