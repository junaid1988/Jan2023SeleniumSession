package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement ele = driver.findElement(By.id("input-email"));
		ele.sendKeys("test@gmail.com");
		
		driver.navigate().refresh();
		
		
		ele.sendKeys("naveen@gmail.com");
		
		
		
//		Thread.sleep(5000);
//		try {
//		ele.clear();
//		ele.sendKeys("naveen@gmail.com");
//		}catch(org.openqa.selenium.StaleElementReferenceException e) {
//			ele.clear();
//			ele.sendKeys("naveen@gmail.com");
//		}
		//StaleElementReferenceException : stale element reference: stale element not found
		
		

	}

}

