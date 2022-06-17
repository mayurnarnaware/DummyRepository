package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objectRepository.OrangeHRMForgotPasswordPage;
import objectRepository.OrangeHRMHomePage;
import objectRepository.OrangeHRMLoginPage;

public class OrangeHRMForgotPasswordTest {
	WebDriver driver;
	OrangeHRMLoginPage lp;
	OrangeHRMHomePage hp;
	OrangeHRMForgotPasswordPage fp;
	
	@BeforeClass
	public void launchOrangeHRM() {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
		lp = new OrangeHRMLoginPage(driver);
		hp = new OrangeHRMHomePage(driver);
		fp = new OrangeHRMForgotPasswordPage(driver);
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
		lp.getPassword().sendKeys("123Admin");
		lp.getLogin().click();
		
		boolean isInvalidCredentialMessage = lp.getInvalidCredentialsMessage().isDisplayed();
		
		Assert.assertTrue(isInvalidCredentialMessage, "StepFail: Invalid credential message not displayed");
		System.out.println("StepPass: Invalid credential message displayed successfully");
		
		lp.getForgotPasswordLink().click();
		
		boolean isForgotPasswordPage = fp.getForgotPasswordHeading().isDisplayed();
		Assert.assertTrue(isForgotPasswordPage, "StepFail: Not on Forgot password page");
		System.out.println("StepPass: On Forgot password page");
		fp.getAuthenticationUsername().sendKeys("admin");
		fp.getResetPassword().click();
		boolean isResetRequestMessage = fp.getResetRequestMessage().isDisplayed();
		
		Assert.assertTrue(isResetRequestMessage, "StepFail: Reset request message not displayed");
		System.out.println("StepPass: Reset request messagedisplayed successfully");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
		
	
	

}
