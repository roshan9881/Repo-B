package facebookpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HonePage {
	
	//Declaration

	@FindBy (xpath = "//home[@name='friend request']")
	private WebElement friendRequest ;
	
	
	@FindBy (xpath = "//home[@name='notification']")
	private WebElement notification ;
	
	@FindBy (xpath = "//home[@name='search']") 
	private WebElement search ;
	
	//Initialization
	
	public  HonePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Use
	
	public void ClickFriendRequest() {
		friendRequest.click();
	}
	
	public void ClickNotification() {
		notification.click();
	}
	
	public void SendSearch() {
		search.sendKeys("abc");
	}
	
	//OR
	
	public void HomePageData() {
		friendRequest.click();
		notification.click();
		search.sendKeys("abc");
	}
	
	
	
}
