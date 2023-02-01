package scriipts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.xml.XmlTest;

public class BaseClass {

	public WebDriver driver;

	@BeforeMethod
	public void init(XmlTest data) {
		
		if(data.getParameter("browser").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(data.getParameter("browser").equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		

		driver.get("https://demo.actitime.com/login.do");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	
	@AfterMethod
	public void close() {

		driver.close();
	}
}
