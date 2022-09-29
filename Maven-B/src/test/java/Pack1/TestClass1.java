package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import facebookpages.LoginPage;
import facebookpages.MessengerPage;
import facebookpages.RoomsPage;

public class TestClass1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Hello");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe") ;
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.get("https://www.facebook.com/");
		
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openMessenger();
		
		MessengerPage messengerPage = new MessengerPage(driver);
		messengerPage.OpenRooms();
		Thread.sleep(3000);
		
		RoomsPage roomsPage = new RoomsPage(driver) ;
		roomsPage.contactToHelpCentre();
		
		System.out.println(driver.getCurrentUrl());
		
		
	}
	
	
	

}
