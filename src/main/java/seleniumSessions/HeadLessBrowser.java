package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {
		
		//testing is happening behind the scene
		//faster
		//can be helpful in linux machine
		//can be used CI/CD pipeline - JenkinS - GithubAction - AWS
		
		//might not work for complex app - html, menu items
		//might not work for internal navigation, mouse hover, mouse movement
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		//driver.quit();
		

	}

}
