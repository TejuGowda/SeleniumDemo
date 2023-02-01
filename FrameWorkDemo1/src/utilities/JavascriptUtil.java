package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptUtil {

	public static JavascriptExecutor  typeCastToJavascript(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		return js;
	}
	
	public static void clickOnElementUsingWebElement(WebDriver driver, WebElement ele) {
		
		
		JavascriptExecutor js = typeCastToJavascript(driver);
		js.executeScript("arguments[0].click()", ele);
		
	}
	
public static void executescript(WebDriver driver, String script) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript(script);
		
	}
}
