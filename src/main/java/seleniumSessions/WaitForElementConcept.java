package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
	    driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		
		By username = By.name("username");
		By passord = By.name("password");

		By forgotPwd = By.linkText("Forgot Password?");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.getElement(username, 10).sendKeys("test@gmail.com");
		eleUtil.getElement(passord).sendKeys("test@123");
		//eleUtil.getElement(forgotPwd, 15).click();
		eleUtil.clickElementWhenReady(forgotPwd, 5);
//		
//		//An expectation for checking that an element is present on the DOM of a page. 
//		//This does notnecessarily mean that the element is visible on the page.
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//seleniu, 4.x
//		WebElement username_ele = wait.until(ExpectedConditions.presenceOfElementLocated(username));
//		username_ele.sendKeys("test@gmail.com");
//		
//		WebElement forgotPwd_ele = wait.until(ExpectedConditions.presenceOfElementLocated(forgotPwd));
//		forgotPwd_ele.click();
//		
//		waitForElementPresence(username, 10).sendKeys("tom@gmail.com");
//		waitForElementPresence(forgotPwd, 5).click();
		
		waitForElementVisible(username, 10).sendKeys("test@gmail.com");
		

	}
	
	/** An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));//seleniu, 4.x
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**An expectation for checking that an element is present on the DOM of a page and visible on the page.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 */
	
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	
	
	

}
