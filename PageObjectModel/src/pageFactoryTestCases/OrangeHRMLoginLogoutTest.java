package pageFactoryTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageFactoryObjectRepository.OrangeHRMHomePage;
import pageFactoryObjectRepository.OrangeHRMLoginPage;

public class OrangeHRMLoginLogoutTest {
	WebDriver driver;
	OrangeHRMLoginPage lp;
	OrangeHRMHomePage hp;
	
	@BeforeClass
	public void launchOrangeHRM() {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		lp = new OrangeHRMLoginPage(driver);
		hp = new OrangeHRMHomePage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void loginLogoutTest() {
		boolean isLoginLogo = lp.getoHRMLogo().isDisplayed();
		
		Assert.assertTrue(isLoginLogo, "StepFail: Not On Login Page | ");
		System.out.println("StepPass: On Login Page");
		lp.getUsername().sendKeys("admin");
		lp.getPassword().sendKeys("admin123");
		lp.getLogin().click();
		
		boolean isHomeLogo = hp.getHomeLogo().isDisplayed();
		Assert.assertTrue(isHomeLogo, "StepFail: Not On Home Page | ");
		
		System.out.println("StepPass: On Home Page");
		String user = hp.getLoggedInUser().getText();
		user = user.substring(8);
		System.out.println("User Logged in is " + user);
		hp.getLoggedInUser().click();
		hp.getLogout().click();
		
		boolean isLoginPanel = lp.getLoginPanel().isDisplayed();
		Assert.assertTrue(isLoginPanel, "StepFail: Not on login Page after logout | ");
		
		System.out.println("StepPass: On login Page after logout");
		
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
		
	
	

}
