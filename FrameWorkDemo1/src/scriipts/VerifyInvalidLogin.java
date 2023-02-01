package scriipts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import excelhelper.*;

import graphql.Assert;
import pom.ActiTime_LoginPage;

public class VerifyInvalidLogin extends BaseClass {

	
	@Test
	public void verifyInvalidLogin() throws InterruptedException {
	
		
		ActiTime_LoginPage loginPage = new ActiTime_LoginPage(driver);
		
		int rowCount = ExcelReader.getRowCount(Paths.FILEPATH+"TestData.xlsx", "Login");
		
		for(int i=1;i<=rowCount;i++) {
			
			String username = ExcelReader.getCellData(Paths.FILEPATH+"TestData.xlsx","Login" ,i, 0);
			String password = ExcelReader.getCellData(Paths.FILEPATH+"TestData.xlsx","Login" ,i, 1);
			loginPage.enterUserName(username);
			
			loginPage.enterPassword(password);
			
			loginPage.clickOnLoginButton();
			
			Thread.sleep(5000);
			
			Assert.assertTrue(loginPage.verifyErrorMsg());
			
		}
		
		
		
		
	}
}
