package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameConcept {
		
		static WebDriver driver;

		public static void main(String[] args) {
			
			driver = new ChromeDriver();
			driver.get("https://selectorshub.com/iframe-scenario/");
			
//			driver.switchTo().frame("pact1").switchTo()
//			                   .frame("pact2").switchTo().frame("pact3")
//			                             .findElement(By.id("glaf")).sendKeys("Riya");
			
			
			driver.switchTo().frame("pact1").switchTo().frame("pat2")
			            .findElement(By.id("jex")).sendKeys("John");
//			
//			//Nestd iframe / iframes
//			
//			driver.switchTo().frame("pact1");
//			driver.findElement(By.id("inp_val")).sendKeys("Tom");
//			
//			driver.switchTo().frame("pact2");
//			driver.findElement(By.id("jex")).sendKeys("Peter");
//			
//			driver.switchTo().frame("pact3");//driver --> pact3
//			driver.findElement(By.id("glaf")).sendKeys("Naveen");
			
//			driver.switchTo().parentFrame();// sel 4.x -- driver --- pact2
//			driver.findElement(By.id("jex")).sendKeys("Riya");
//			
//			driver.switchTo().parentFrame();// driver -- pact1
//			driver.findElement(By.id("inp_val")).sendKeys("Azam");
			
			//driver is on pact1 ---> main page (default content)
			
			//pact 3 to pact 1
//			driver.switchTo().parentFrame();//pact2 
//			driver.switchTo().parentFrame();//pact1
//			driver.findElement(By.id("inp_val")).sendKeys("Testing");
			
//			driver.switchTo().defaultContent();
//			
//			String header =
//					driver.findElement(By.cssSelector("h1.elementor-heading-title.elementor-size-default")).getText();
//			System.out.println(header);

			
			
			


			


	}

}
