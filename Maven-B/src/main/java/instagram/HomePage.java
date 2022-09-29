package instagram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Declaration
	@FindBy (xpath = "//home[@name='profile']" )
	private WebElement profile ;
	
	@FindBy (xpath = "//home[@name='notification']")
	private WebElement notification ;
	
	@FindBy (xpath = "//button[text()= 'search']" )
	private WebElement search;
	
	//Initialization
	
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Use
	
	public void ClickOnProfile() {
		profile.click();
	}
	public void ClickOnNotification() {
		notification.click();
	}
	public void SendSearch() {
		search.sendKeys("mahi7781");
	}
	
	//OR
	
	public void HomePageData() {
		profile.click();
		notification.click();
		search.sendKeys("mahi7781");
	}
	
	
	
	
	
	
	

}
