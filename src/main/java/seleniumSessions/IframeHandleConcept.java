package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandleConcept {
		
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			
			driver = new ChromeDriver();
			driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
			Thread.sleep(4000);
			
			
			
			

	}

}
