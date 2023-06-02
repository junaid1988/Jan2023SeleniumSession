package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionConcept {
	
	@Test
	public void searchTest() {
		String name = "Macbook";
		Assert.assertEquals(name, "Macbook");
	}
	
	@Test
	public void sumTest() {
		int a = 10;
		int b = 20;
		int sum = a+b;
		Assert.assertEquals(sum, 30);
	}
	
	@Test
	public void nameTest() {
		String userName = "Naveen";
		Assert.assertNotNull(userName);
	}
	
	@Test
	public void isEleDisplayed() {
		String loginBtn = "LoginAmazonButton";
		Assert.assertTrue(loginBtn.contains("LoginAmazon"));
	}
	
	@Test
	public void isUserInActive() {
		boolean inactiveFlag = false;
		Assert.assertFalse(inactiveFlag);
		
		
	}




}