package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ActiTIME_EnterTimeTrackPage {

	@FindBy(xpath = "//a[@class='userProfileLink username ']")
	private WebElement userinfo;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutButton;

	public ActiTIME_EnterTimeTrackPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public boolean verifyUsername() {

		try {
			return userinfo.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.log("element is not present", true);
			return false;
		}
	}

	public boolean verifyLogoutButton() {

		try {
			return logoutButton.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.log("element is not present", true);
			return false;
		}
	}
}
