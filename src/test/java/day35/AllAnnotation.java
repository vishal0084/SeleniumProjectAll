package day35;

import org.testng.annotations.*;

public class AllAnnotation {
	
	@BeforeSuite
	void bs() {
		System.out.println("this is before suite method");
	}
	
	@AfterSuite
	void as() { 
		System.out.println("this is After suite method");
	}
	
	@BeforeTest
	void bt() {
		System.out.println("this is before test method");

	}
	
	@AfterTest
	void at() {
		System.out.println("this is After test method");

	}
	
	@BeforeMethod
	void bm() {
		System.out.println("this is before  method");

	}
	
	@AfterMethod
	void am() {
		System.out.println("this is After method");

	}
	
	@BeforeClass
	void bc() {
		System.out.println("this is before class method");

	}
	
	@AfterClass
	void ac() {
		System.out.println("this is After class method");

	}
	
	@Test(priority=1)
	void tm1() {
		System.out.println("this is test  method 1 ");

	}
	
	@Test(priority=2)
	void tm2() {
		System.out.println("this is test  method 2 ");

	}

}
