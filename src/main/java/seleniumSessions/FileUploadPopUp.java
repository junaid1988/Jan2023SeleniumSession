package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		
		//never use AutoIT  -- is only for windows machines --
		//it wont work on remote machine/mac/linux/docker/cloud
		//Robot class --> only for windows 
		//Sikuli lib: image based
		
		//sendKeys --> file path
		//<type = file>
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\junai\\Downloads\\Zealtech\\letter1.jpg");
		
		//type = file --> if its not there -- you can not use sendKeys
		//ask the dev team to add this attribute 


	}

}

