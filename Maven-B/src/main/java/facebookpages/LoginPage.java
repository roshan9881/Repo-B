package facebookpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	
	//Declaration
	
	@FindBy (xpath = "//input[@id='email']")
	private WebElement userName ;
	
	@FindBy (xpath = "//input[@id='pass']") 
	private WebElement password ;
	
	@FindBy (xpath = "//button[text()='Log In']") 
	private WebElement loginButton ;

	@FindBy (xpath = "//a[text()='Create New Account']") 
	private WebElement createNewAccount ;
	
	@FindBy (xpath = "//a[text()='Messenger']") 
	private WebElement messengerLink ;
	
	// Initialization
	
	public LoginPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	// Use
	
	public void sendUserName () {
		userName.sendKeys("hello@123");
	}
	
	public void sendPassword() {
		password.sendKeys("12345");
	}
	
	public void ClickOnLoginButton() {
		loginButton.click();
	}
	
	public void clickOnCreateNewAccount() {
		createNewAccount.click();
		
//		Actions act = new Actions(driver);
//		act.moveToElement(createNewAccount).click().build().perform();
	}
	
	public void clickOnMessenger () {
		messengerLink.click();
	}
	
	// OR
	//complete functionality
	
	public void LoginButton() {
		userName.sendKeys("hello@123");
		password.sendKeys("12345");
		loginButton.click();
		createNewAccount.click();
		messengerLink.click();
	}

	public void openMessenger() {
		// TODO Auto-generated method stub
		
	
	
	}	
	
}
