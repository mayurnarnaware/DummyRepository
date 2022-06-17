package pageFactoryObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMForgotPasswordPage {
	WebDriver driver;
	
	//private By forgotPasswordHeading = By.xpath("//h1[text()='Forgot Your Password?']");
	@FindBy(xpath="//h1[text()='Forgot Your Password?']")
	WebElement forgotPasswordHeading;
	
	//private By authenticationUsername = By.id("securityAuthentication_userName");
	@FindBy(id="securityAuthentication_userName")
	WebElement authenticationUsername;
	
	//private By resetPassword = By.xpath("//input[@value='Reset Password']");
	@FindBy(xpath="//input[@value='Reset Password']")
	WebElement resetPassword;
	
	//private By resetRequestMessage = By.xpath("//div[@class='message warning fadable']");
	
	@FindBy(xpath="//div[@class='message warning fadable']")
	WebElement resetRequestMessage;
	
	
	public OrangeHRMForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getForgotPasswordHeading() {
		return forgotPasswordHeading;
	}
	public WebElement getAuthenticationUsername() {
		return authenticationUsername;
	}
	public WebElement getResetPassword() {
		return resetPassword;
	}
	public WebElement getResetRequestMessage() {
		return resetRequestMessage;
	}
	
	
}
