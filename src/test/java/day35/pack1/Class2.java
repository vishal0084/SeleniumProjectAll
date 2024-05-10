package day35.pack1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class2 {
	
	@Test
	public void xyz() {
		System.out.println("this is xyz from class 2");
	}

	
	@AfterTest
	public void m() {
		System.out.println("After test method ");
	}
	
	@AfterSuite
	public void as() { 
		System.out.println("after suite method");
	}
}
