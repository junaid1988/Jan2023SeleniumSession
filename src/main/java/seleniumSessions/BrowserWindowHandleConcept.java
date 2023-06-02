package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleConcept {

	public static void main(String[] args) throws InterruptedException {
		
		//new window/tab
		//click on ele --- new tab/window -- browser window pop up
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent page
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		//parent(driver) to child windows
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it =handles.iterator();
		
		String parentWindowId = it.next();
		String childWindowId = it.next();
		
		System.out.println("parent window Id: " +parentWindowId);
		System.out.println("child window Id: " +childWindowId);
		
		//switching work: 
		driver.switchTo().window(childWindowId);
		System.out.println("child window url: " + driver.getCurrentUrl());//twitter url
		driver.close();//close child window
		
		driver.switchTo().window(parentWindowId);//back to parent window
		System.out.println("parent window url: " + driver.getCurrentUrl());//orangehrm url
		
		driver.quit();//close parent window

		


	}

}
