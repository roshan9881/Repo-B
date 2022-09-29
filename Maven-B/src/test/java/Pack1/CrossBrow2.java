package Pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import facebookpages.LoginPage;
import facebookpages.MessengerPage;
import facebookpages.RoomsPage;

public class CrossBrow2 {
	
	private WebDriver driver;
	private LoginPage loginPage ;
    private MessengerPage messengerPage ;
	private RoomsPage roomsPage ;
	private SoftAssert soft ;
	
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browserName) {
		
		System.out.println(browserName);
		
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe") ;	
		    driver = new ChromeDriver() ;
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		}
		
		if(browserName.equals("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe") ;	
		    driver = new ChromeDriver() ;
		    
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
		}
		}
		
		@BeforeClass
		public void createPOMObjects() {
			
			loginPage = new LoginPage(driver);
		    messengerPage = new MessengerPage(driver);
			roomsPage = new RoomsPage(driver) ;	
		}
		
		@BeforeMethod
		public void openRoomPage() {
			driver.get("https://www.facebook.com/");
			loginPage.openMessenger();
			messengerPage.OpenRooms();
			soft = new SoftAssert();
		}
		
		@Test
		public void verifyReturnToMessengerButton() {
			
			System.out.println("verifyReturnToMessengerButton");
			roomsPage.goBackToMessenger();
			String url = driver.getCurrentUrl();
			String title = driver.getTitle() ;
			
			soft.assertEquals(url, "https://www.messenger.com/") ;
			soft.assertEquals(title, "Messenger") ;
			
			soft.assertAll() ;
			
		}
		
		@Test
		public void verifyContactToHelpCenterButton() {
		
			System.out.println("verifyContactToHelpCenterButton");
			roomsPage.contactToHelpCentre();
			String url = driver.getCurrentUrl();
			String title = driver.getTitle();
			
			soft.assertEquals(url, "https://www.messenger.com/help") ;
			soft.assertEquals(title, "Messenger Help center") ;
			
			soft.assertAll() ;
		}
		
		@AfterMethod
		public void logoutFromApplication() {
			System.out.println("After Method");
			System.out.println("LOGOUT");
		}
		
		@AfterClass
		public void clearObjects() {
			loginPage = null ;
			messengerPage = null ;
			roomsPage = null ;
		}
		
		@AfterTest
		public void closeBrowser() {
			
			System.out.println("After Class");
			driver.close();
			driver = null ;
			
			System.gc() ;
			
		}
		


}
