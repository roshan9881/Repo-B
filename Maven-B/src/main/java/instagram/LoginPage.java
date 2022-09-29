package instagram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Declaration

	@FindBy(xpath = "//input[@id='email']")
	private WebElement username;
	
	@FindBy (xpath = "//input[@id='pass']")
	private WebElement password ;
	
	@FindBy (xpath = "//button[text()='Log In']") 
	private WebElement LoginButton ;
	
	//Initialization
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	// Use
	
	public void SendUserName() {
		username.sendKeys("hii@22334455");
	}
	public void SendPassword() {
		password.sendKeys("2315567");
	}
	public void ClickOnLoginButton() {
		LoginButton.click();
	}
	
	//OR
	
	public void LoginInsta() {
		username.sendKeys("hii@22334455");
		password.sendKeys("2315567");
		LoginButton.click();
	}
	
	
	
	
	
	
	
}
