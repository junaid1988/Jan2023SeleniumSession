package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverConcept {

	public static void main(String[] args) {
		
		//4.5.0
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\junai\\OneDrive\\Documents\\SeleniumDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

	}

}
