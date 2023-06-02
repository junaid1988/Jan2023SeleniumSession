package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumSessions.JavaScriptUtil;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
//		 JavascriptExecutor js=(JavascriptExecutor)driver;
//		String title =  js.executeScript("return document.title;").toString();
//		System.out.println(title);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		String title = jsUtil.getTitleByJS();
//		System.out.println(title);
//		
//		jsUtil.generateAlert("This is my alert");
		
//		String pageText = jsUtil.getPageInnerText();
//		System.out.println(pageText.contains("Task & Event Tracking"));
//		System.out.println(pageText.contains("Mobile iOS & Android"));
		
		//jsUtil.zoomChromeEdge("200.0");
		//responsive testing --> 50% 100% 60% 400%
		
		//WebElement pricing = driver.findElement(By.xpath("//a[text()='Pricing']"));
		//jsUtil.drawBorder(pricing);
		
		//WebElement form = driver.findElement(By.id("hs-login"));
		//jsUtil.drawBorder(form);
		
		//jsUtil.flash(form);
		
//		jsUtil.scrollPageDown();
//		Thread.sleep(2000);
//		jsUtil.scrollPageUp();
		
		WebElement ele =driver.findElement(By.xpath("//span[text()='Frequently repurchased in Drugstore']"));
		jsUtil.scrollIntoView(ele);
		
		
		
		
		

		
		
	 

	}
	
	

}
