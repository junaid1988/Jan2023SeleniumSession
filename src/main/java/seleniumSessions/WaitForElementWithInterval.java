package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementWithInterval {

	static WebDriver driver;

	public static void main(String[] args) {
		
	    driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		
		By forgotPwdLink = By.linkText("Forgot Password?111");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(forgotPwdLink)).click();
		//(tried for 5 second(s) with 500 milliseconds interval)

		
	}
}
