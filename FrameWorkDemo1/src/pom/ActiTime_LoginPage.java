package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import utilities.*;

public class ActiTime_LoginPage {

	@FindBy(id = "username")
	private WebElement usernameTextBox;

	@FindBy(name = "pwd")
	private WebElement pwdTextBox;

	@FindBy(id = "loginButton")
	private WebElement loginButton;
	
	
	@FindBy(xpath = "//span[text()='Username or Password is invalid. Please try again.']")
	private WebElement errorMsg;
	
	@FindBy(xpath="//a[text()='Forgot your password?']")
	private WebElement forgotPassword;
	
	@FindBy(id = "forgetPasswordEmailOrUsername")
	private WebElement forgotPasswordTextBox;
	
	@FindBy(xpath = "//div[text()='Request Login Info']")
	private WebElement requestLoginButton;
	
	
	@FindBy(xpath = "//span[@id='errorSpan']")
	private WebElement errorMsg_ForgotPaswrod;

	public ActiTime_LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void enterUserName(String username) {

		usernameTextBox.sendKeys(username);
	}

	public void enterPassword(String password) {

		pwdTextBox.sendKeys(password);
	}

	
	
	public void clickOnLoginButton() {

		loginButton.click();
	}
	
	
	
	public boolean verifyErrorMsg() {
		
		try {
			return errorMsg.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.log("element is not present", true);
			return false;
		}
	}
	
	public void clickOnForgotPasswordButton() {

		forgotPassword.click();
	}
	

	public void enterEmail_ForgotPassword(String email) {

		forgotPasswordTextBox.sendKeys(email);
	}
	
	
	public void clickOnRequestLoginButton() {

		requestLoginButton.click();
		//JavascriptUtil.clickOnElementUsingWebElement(driver,requestLoginButton);
	}
	

	public boolean verifyErrorMsg_ForgotPassword(WebDriver driver) {

		try {
			ExplicitWaitUtil.waitForElementToVisible(driver, errorMsg_ForgotPaswrod);
			return errorMsg_ForgotPaswrod.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.log("element is not present", true);
			return false;
		}
	}
	
	public String getErrorMessgetext() {
		
		return errorMsg_ForgotPaswrod.getText();
	}
}
