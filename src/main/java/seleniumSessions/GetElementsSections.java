package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsSections {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By rightPanelLinks = By.className("list-group-item");
		By footerLinks =By.xpath("//footer//a");
		
		clickElementFromPageSection(rightPanelLinks, "Forgotten Password");
		
		
		
		
//		List<WebElement> rightPanelLinksList = getElements(rightPanelLinks);
//		for(WebElement e : rightPanelLinksList) {
//			String text = e.getText();
//			if(text.contains("Forgotten Password")) {
//				e.click();
//				break;
//			}
//			
//		}
		
		
		
		
//		if (getElements(rightPanelLinks).size() == 13) {
//			System.out.println("right panel links count is correct");
//		}
//		List<String> rightPanelLinksTextList = getElementsTextList(rightPanelLinks);
//		if (rightPanelLinksTextList.contains("My Account")) {
//			System.out.println("My account -- PASS");
//			
//
//		}
//		if (rightPanelLinksTextList.contains("Register")) {
//			System.out.println("Register -- PASS");
//
//		}
//
	}
	
	public static void clickElementFromPageSection(By locator, String eleText) {
		List<WebElement> eleList = getElements(locator);
		for(WebElement e : eleList) {
			String text = e.getText();
			System.out.println(text);
			if(e.getText().equals(eleText)) {
				e.click();
				break;
			}
		}
	}

	public static List<String> getElementsTextList(By locator) {
		List<WebElement> elementsLinksList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();

		for (WebElement e : elementsLinksList) {
			String text = e.getText();
			eleTextList.add(text);
		}
		return eleTextList;

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
