package pageFactoryObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMHomePage {
	WebDriver driver;
//	private By homeLogo = By.xpath("//img[contains(@src,'images/logo.png')]");
//	private By loggedInUser = By.id("welcome");
//	private By logout = By.linkText("Logout");
	
	@FindBy(xpath = "//img[contains(@src,'images/logo.png')]")
	private WebElement homeLogo;
	
	@FindBy(id = "welcome")
	private WebElement loggedInUser;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;

	
	public OrangeHRMHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getHomeLogo() {
		return homeLogo;
	}
	
	public WebElement getLoggedInUser() {
		return loggedInUser;
	}
	
	public WebElement getLogout() {
		return logout;
	}
	
	
}
