package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		String username = "admin";
		String password = "admin";
		
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");

	}

}
