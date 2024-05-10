package day35;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertation {
	
	@Test
	void test() {
		
		
	/*	if(x==y) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		*/ 
		int x=20;
		int y=15;
		
		Assert.assertEquals(x>y,true,"a is not grather then b");
		
//		Assert.assertTrue(true);
		
		
		
		
		
	}

}
