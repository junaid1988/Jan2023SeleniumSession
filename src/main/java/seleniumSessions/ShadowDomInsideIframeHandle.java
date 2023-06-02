package seleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomInsideIframeHandle {
		
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			
			driver = new ChromeDriver();
			driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
			Thread.sleep(4000);
			
			String tea_JsPath = "return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
			
			driver.switchTo().frame("pact");
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement tea = (WebElement)js.executeScript(tea_JsPath);
			tea.sendKeys("Masala tea");

	}

}
