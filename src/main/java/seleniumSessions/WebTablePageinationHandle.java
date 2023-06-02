package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePageinationHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);
		
		
//		do {
//			
//		} while(condition)
		
//		multi seletion:
		
		//single selection:

		while (true) {

			// element is present on first the page
			if (driver.findElements(By.xpath("//td[text()='Brazil']")).size() > 0) {
				// select the checkbox
				selectCountry("Brazil");
				break;

			} else {
				// pageination logic:
				// click on next link:

				WebElement next = driver.findElement(By.linkText("Next"));

				if (next.getAttribute("class").contains("disable")) {
					System.out.println("pagination is over -- country not found ");
					break;

				}

				next.click();
				Thread.sleep(1500);
			}

		}

	}

	public static void selectCountry(String countryName) {
		driver.findElement(By.xpath("//td[text()='" + countryName + "']/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}

}
