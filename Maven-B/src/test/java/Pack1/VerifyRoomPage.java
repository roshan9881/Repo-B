package Pack1;

// correction in a code - it is an inappropriate example

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import facebookpages.LoginPage;
import facebookpages.MessengerPage;
import facebookpages.RoomsPage;

public class VerifyRoomPage {

	private WebDriver driver ;
	private LoginPage loginpage ;
	private RoomsPage roomsPage ;
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe") ;	
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void openRoomPage() {
	    System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		
	    loginpage = new LoginPage(driver);
		loginpage.openMessenger();
		
		MessengerPage messengerPage = new MessengerPage(driver);
		messengerPage.OpenRooms();
		roomsPage = new RoomsPage(driver) ;	
	}
	
	@Test
	public void verifyContactToHelpCenterButton() {
		System.out.println("Test 1");
		roomsPage.contactToHelpCentre();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		if (url.equals("https://www.messenger.com/help") && title.equals("Messenger Help Centre")) {
		System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}			
	}
	
	@Test
	public void verifyReturnToMessengerButton() {
		System.out.println("Test 2");
		roomsPage.goBackToMessenger(); 
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		if(url.equals("https://www.messenger.com/") && title.equals("Messenger")) {
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
	}
	
	@AfterMethod
	public void logoutFromApplication() {
		System.out.println("After Method");
		System.out.println("Logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("After Class");
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
