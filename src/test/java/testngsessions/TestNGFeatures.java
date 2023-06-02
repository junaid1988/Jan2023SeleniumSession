package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFeatures {
	
	//globale pre conditions
	//pre conditions
	//test steps --> act vs exp results  --PASS/FAIL
	//Globale post steps
	
//	BS -- db connection
//	BT ---- createUser
//	BC---- openBrowser
	
//	BM---- loginApp
//	test --- addToCart test
//	AM---- logout
	
    //	BM---- loginApp
    //	test --- payment test 
    //	AM---- logout
	
    //	BM---- loginApp
    //	test --- search test 
    //	AM---- logout
	
//	AC---- closeBrowser
//	AT---- deleteUser
//AS---- closeDBConnection
	
	
	//1
	@BeforeSuite
	public void DBconnections() {
		System.out.println("BS -- db connection");
		
	}
	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT ---- createUser");
	}
	//3
	@BeforeClass
	public void operBrowser() {
		System.out.println("BC---- openBrowser");
	}
	//4 //7 //10
	@BeforeMethod
	public void loginApp() {
		System.out.println("BM---- loginApp");
	}
	
	//11
	@Test
	public void searchTest() {
		System.out.println("test --- search test ");
	}
	
	//5
	@Test
	public void addToCarTest() {
		System.out.println("test --- addToCart test ");
	}
	
	//8
	@Test
	public void paymentTest() {
		System.out.println("test --- payment test ");
	}
	
	//6 //9 //12
	@AfterMethod
	public void logout() {
		System.out.println("AM---- logout");
	}
	
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC---- closeBrowser");
	}
	
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT---- deleteUser");
	}
	
	//15
	@AfterSuite
	public void closeDBConnection() {
		System.out.println("AS---- closeDBConnection");
	}

}
