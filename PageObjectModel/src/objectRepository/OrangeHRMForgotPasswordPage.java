package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHRMForgotPasswordPage {
	WebDriver driver;
	
	private By forgotPasswordHeading = By.xpath("//h1[text()='Forgot Your Password?']");
	private By authenticationUsername = By.id("securityAuthentication_userName");
	private By resetPassword = By.xpath("//input[@value='Reset Password']");
	private By resetRequestMessage = By.xpath("//div[@class='message warning fadable']");
	
	public OrangeHRMForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getForgotPasswordHeading() {
		return driver.findElement(forgotPasswordHeading);
	}
	public WebElement getAuthenticationUsername() {
		return driver.findElement(authenticationUsername);
	}
	public WebElement getResetPassword() {
		return driver.findElement(resetPassword);
	}
	public WebElement getResetRequestMessage() {
		return driver.findElement(resetRequestMessage);
	}
	
	
}
