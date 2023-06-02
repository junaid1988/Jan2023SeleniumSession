package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
	    driver = brUtil.initDriver("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = brUtil.getPageTitle();
		System.out.println("page title : " +title);
		System.out.println(brUtil.getPageURL());
		
		By fn = By.id("input-firstname");
		By ln = By.id("input-lastname");
		By emailId = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPass = By.id("input-confirm");
		By checkbox = By.name("agree");
		By continueBtn =By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(fn, "Ferdows");
		eleUtil.doSendKeys(ln, "Azam");
		eleUtil.doSendKeys(emailId, "azam12@gmail.com");
		eleUtil.doSendKeys(telephone, "9163337656");
		eleUtil.doSendKeys(password, "azam@123");
		eleUtil.doSendKeys(confirmPass, "azam@123");	
		eleUtil.doClick(checkbox);
		eleUtil.doClick(continueBtn);
//		
//		String text =driver.findElement(By.tagName("h1")).getText();
//		System.out.println(text);
//		if(text.equals("Your Account Has Been Created!")) {
//			System.out.println("PASS");
//		}
//		else {
//			System.out.println("FAIL");
//		}
		
		eleUtil.doGetAttributeValue(fn, "placeholder");
		eleUtil.doGetAttributeValue(ln, "");
		eleUtil.doGetAttributeValue(emailId, "azam12@gmail.com");
		eleUtil.doGetAttributeValue(telephone, "9163337656");
		eleUtil.doGetAttributeValue(password, "azam@123");
		eleUtil.doGetAttributeValue(confirmPass, "azam@123");




		

	}
	
	
	
	
	
	
	
	
	
	

}
