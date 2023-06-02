package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//chrome//firefox//safari/edge
		
		//chrome 111.x
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		//ChromeDriver driver = new ChromeDriver(co);
		
//		FirefoxDriver driver = new FirefoxDriver();
		
		//Automation steps:
		
		WebDriver driver = new FirefoxDriver();//launch chrome
		driver.get("https://www.amazon.com");//enter url
		String title = driver.getTitle();//get the title
		System.out.println(title);
		
		//Verification point/checkpoint/act vs exp result
		if(title.contains("Amazon.com")) {
			System.out.println("correct title");
			
		}
		else {
			System.out.println("incorrect title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		
		//Automation Steps + verification point = Automation Testing
		
//		driver.quit();// close the browser
//		driver.close(); // close the browser
//		

	}

}
