package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverLaunch {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver1.get("https://www.amazon.com");
		
		//admin
		//user
		
		driver = driver1;
		System.out.println(driver.getTitle());



	}

}
