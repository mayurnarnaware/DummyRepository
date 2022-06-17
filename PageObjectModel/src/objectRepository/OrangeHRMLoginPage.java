package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHRMLoginPage {
	WebDriver driver;
	private By oHRMLogo = By.xpath("//img[contains(@src,'login/logo.png')]");
	private By loginPanel = By.id("logInPanelHeading");
	private By username = By.id("txtUsername");
	private By password = By.id("txtPassword");
	private By login = By.id("btnLogin");
	private By invalidCredentialsMessage = By.id("spanMessage");
	private By forgotPasswordLink = By.linkText("Forgot your password?");
	
	
	public OrangeHRMLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getoHRMLogo() {
		return driver.findElement(oHRMLogo);
	}
	
	public WebElement getLoginPanel() {
		return driver.findElement(loginPanel);
	}
	public WebElement getUsername() {
		return driver.findElement(username);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getLogin() {
		return driver.findElement(login);
	}

	public WebElement getInvalidCredentialsMessage() {
		return driver.findElement(invalidCredentialsMessage);
	}

	public WebElement getForgotPasswordLink() {
		return driver.findElement(forgotPasswordLink);
	}
	
	
}
