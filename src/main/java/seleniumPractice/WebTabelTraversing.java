package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabelTraversing {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
	    driver = new ChromeDriver();
		driver.get("");
	

	}
	
	public static int getColumnCount() {
		return driver.findElements(By.xpath("//table[@id='customer']//tr/th")).size();
	}

}
