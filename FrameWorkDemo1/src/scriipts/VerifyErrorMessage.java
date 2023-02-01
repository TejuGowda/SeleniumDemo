package scriipts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.ActiTIME_EnterTimeTrackPage;
import pom.ActiTime_LoginPage;

public class VerifyErrorMessage extends BaseClass {

	
	@Test
	public void verifyErroMessage_ForGotPassword() {
		
	
		ActiTime_LoginPage loginPage = new ActiTime_LoginPage(driver);
		
		loginPage.clickOnForgotPasswordButton();
		
		loginPage.enterEmail_ForgotPassword("dfsdfs");
		
		loginPage.clickOnRequestLoginButton();
		
		
		Assert.assertTrue(loginPage.verifyErrorMsg_ForgotPassword(driver));
		
		String actualMsg = loginPage.getErrorMessgetext();
		
		String expectedMsg = "\r\n"
				+ "Cannot recover login info.\r\n"
				+ "Please make sure that everything is typed in correctly.";
		
		Assert.assertEquals(actualMsg, expectedMsg);
		
	
		
	}
	
//	@Test
//	public void verifyInvalidLogin() {
//	
//		
//		ActiTime_LoginPage loginPage = new ActiTime_LoginPage(driver);
//		
//		loginPage.enterUserName("assd");
//		
//		loginPage.enterPassword("shdgfd");
//		
//		loginPage.clickOnLoginButton();
//		
//		Assert.assertTrue(loginPage.verifyErrorMsg());
//		
//		
//		
//	}
//	
//	@Test
//	public void verifyLogin() {
//		
//		
//		
//		ActiTime_LoginPage loginPage = new ActiTime_LoginPage(driver);
//		
//		loginPage.enterUserName("admin");
//		
//		loginPage.enterPassword("manager");
//		
//		loginPage.clickOnLoginButton();
//		
//		ActiTIME_EnterTimeTrackPage trackPage = new ActiTIME_EnterTimeTrackPage(driver);
//		
//		Assert.assertTrue(trackPage.verifyLogoutButton());
//		
//		
//	}
}
