package scriipts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import graphql.Assert;
import pom.ActiTIME_EnterTimeTrackPage;
import pom.ActiTime_LoginPage;

public class VerifyLogin extends BaseClass {

	
	@Test
	public void verifyLogin() {
		
		
		
		ActiTime_LoginPage loginPage = new ActiTime_LoginPage(driver);
		
		loginPage.enterUserName("admin");
		
		loginPage.enterPassword("manager");
		
		loginPage.clickOnLoginButton();
		
		ActiTIME_EnterTimeTrackPage trackPage = new ActiTIME_EnterTimeTrackPage(driver);
		
		Assert.assertTrue(trackPage.verifyLogoutButton());
		
		
	}
}
