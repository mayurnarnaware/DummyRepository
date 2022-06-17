package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHRMHomePage {
	WebDriver driver;
	private By homeLogo = By.xpath("//img[contains(@src,'images/logo.png')]");
	private By loggedInUser = By.id("welcome");
	private By logout = By.linkText("Logout");
	
	public OrangeHRMHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getHomeLogo() {
		return driver.findElement(homeLogo);
	}
	
	public WebElement getLoggedInUser() {
		return driver.findElement(loggedInUser);
	}
	
	public WebElement getLogout() {
		return driver.findElement(logout);
	}
	
	
}
