package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {

	@Test
	public void homePageConcept() {
		System.out.println("homePageConcept");
		int i = 9 / 0;

	}

	@Test(dependsOnMethods = "homePageConcept")
	public void searchTest() {
		System.out.println("searchTest");

	}

	@Test(dependsOnMethods = "searchTest")
	public void cartTest() {
		System.out.println("cartTest");

	}

	// AAA Rule -- Arrange, Act, Assertion

	// Test cases should be independent
	// CRUD --
	// createUserTest --> create a new user --assert
	// getUserTest --> create a new user(xxxxx) + get the same user(xxxxx) -- assert
	// invalid -getUserTest --> use the same userid(124) + get the same use
	// --assert--> 123--> QA --> stg--123x
	// udpateUserTest --> create a new user(xxxx) + get the same user(xxxxx) --
	// update user (xxxx) -- assert
	// deleteUserTest --> create a new user(xxxx) + get the same user(xxxxx) --
	// delete user (xxx) -- assert

	// C-R-U-D

}
