package seleniumSessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//selenium 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//selenium 4.x
		
		//imp wait: global wait
		//applicable for all the web elements
		//not applied to the specific element
		//can not be used to non web elements: title, url, alerts
		
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Macbook");
		String label = driver.findElement(By.id("nav-logo-sprites")).getAttribute("aria-lable");//10
		System.out.println(label);
		//e3 - 10 -- all dopdown
		//e4 -- search icon
		//e5 
		//e6 - 10
		
		//product page: 20 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//20
		//e7 e8 e9 ---> 20 secs
		
		//home page: 20 secs -->10 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//10
		
		//registration page: //10 -- 5 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//50 
		
		//product page: 20 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//20
		//ele -- 20 secs --> 5 secs ---> 15 secs x
		
		//We never use implicit wait in framework
		
		//page --> no wait -- 0 secs: -- nullify of imp wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));//
		
		//e1 to 100 --> imp = 20 secs ---> FE --> imp wait(0,1,5,10,20) -- perform action
		
		//can not be used to non web elements: title, url, alerts
		
		



		

		

		
		

	}

}
