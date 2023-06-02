package testngsessions;

import org.testng.annotations.Test;

public class ExpectedConditionsConcept {
	
	
	//testng -- only java
	//pytest -- python 
	//Nunit -- C#
	//PhpUnit -- PHP
	//Mocha/Jasmine -- chai -- JS
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void homePageConcept() {
		System.out.println("homePageConcept");
		int i = 9 / 0;

	}
	
	
	
	
	
	
	
	
	
	
	

}
