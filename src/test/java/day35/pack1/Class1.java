package day35.pack1;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	
	@Test
	public void abc() {
		System.out.println("this is abc from class 1");
	}

	@BeforeTest 
	public void m() {
		System.out.println("Before test method ");
	}
	
	@BeforeSuite
	public void bs() {
		System.out.println("before suite method ");
	}
}
