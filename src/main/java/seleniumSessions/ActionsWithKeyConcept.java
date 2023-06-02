package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsWithKeyConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
		
		Actions act = new Actions(driver);
//		act.sendKeys(driver.findElement(firstName), "Pooja") 
//		                .sendKeys(Keys.TAB)
//		                .pause(1000)
//		                .sendKeys("Hedge")
//		                .sendKeys(Keys.TAB)
//		                .pause(1000)
//		                .sendKeys("navenn@gmail.com")
//		                .sendKeys(Keys.TAB)
//		                .pause(1000)
//		                .sendKeys("9166573423")
//		                .sendKeys(Keys.TAB)
//		                .pause(1000)
//		                .sendKeys("pooja@123")
//		                .sendKeys(Keys.TAB)
//		                .pause(1000)
//		                .sendKeys("pooja@123")
//		                .sendKeys(Keys.TAB)
//		                .pause(1000)
//		                .sendKeys(Keys.TAB)
//		                .pause(1000)
//		                .sendKeys(Keys.TAB)
//		                .pause(1000)
//		                .click()
//		                .sendKeys(Keys.TAB)
//		                .pause(1000)
//		                .click()
//		                   .build()
//		                      .perform();
		
		
		driver.get("https://www.amazon.com/");
		Action action = act.sendKeys(Keys.TAB)
		   .sendKeys(Keys.TAB)
		   .sendKeys(Keys.TAB)
		   .sendKeys(Keys.TAB)
		   .sendKeys(Keys.TAB)
		   .sendKeys("Macbook pro")
		          .sendKeys(Keys.ENTER)
		   .build();
		   action.perform();
		   




 
	}

}
