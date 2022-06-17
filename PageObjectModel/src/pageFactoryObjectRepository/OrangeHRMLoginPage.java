package pageFactoryObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage {
	WebDriver driver;
//	private By oHRMLogo = By.xpath("//img[contains(@src,'login/logo.png')]");
//	private By loginPanel = By.id("logInPanelHeading");
//	private By username = By.id("txtUsername");
//	private By password = By.id("txtPassword");
//	private By login = By.id("btnLogin");
//	private By invalidCredentialsMessage = By.id("spanMessage");
//	private By forgotPasswordLink = By.linkText("Forgot your password?");
	
	
	@FindBy(xpath = "//img[contains(@src,'login/logo.png')]")
	private WebElement oHRMLogo;
	
	@FindBy(id = "logInPanelHeading")
	private WebElement loginPanel;
	
	@FindBy(id = "txtUsername")
	private WebElement username;
	
	@FindBy(id = "txtPassword")
	private WebElement password;
	
	@FindBy(id = "btnLogin")
	private WebElement loginBtn;
	
	@FindBy(id = "spanMessage")
	private WebElement invalidCredentialsMessage;
	
	@FindBy(linkText = "Forgot your password?")
	private WebElement forgotPasswordLink;

	public OrangeHRMLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getoHRMLogo() {
		return oHRMLogo;
	}
	
	public WebElement getLoginPanel() {
		return loginPanel;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLogin() {
		return loginBtn;
	}

	public WebElement getInvalidCredentialsMessage() {
		return invalidCredentialsMessage;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}
	
	
}
