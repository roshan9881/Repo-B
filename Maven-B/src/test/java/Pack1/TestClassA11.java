package Pack1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClassA11 {
	
		@BeforeSuite
		public void beforesuite() {
			System.out.println("Before Suite test Class A11");
		}
	
		@BeforeTest
		public void beforeTest() {
			System.out.println("Before Test Test Class A11");
		}
		
	
		@BeforeClass
		public void beforeClass() {
			System.out.println("Before Class");
		}
		
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("Before Method");
		}
		
		@Test
		public void testA() {
			System.out.println("TEST A");
		}
		
		@Test ()
		public void testB() {
			System.out.println("Test B");
		}
		
		@Test ()
		public void testC() {
			System.out.println("Test C");
			Assert.fail();
		}
		
		@Test
		public void testD() {
			System.out.println("Test D");
		}
		
		@AfterMethod
		public void afterMethod() {
			System.out.println("After Method");
		}
		
		@AfterClass
		public void afterClass() {
			System.out.println("After Class");
		}
	
		@AfterTest
		public void afterTest() {
			System.out.println("after Test Test Class A11");
		}
		
		@AfterSuite
		public void aftersuite() {
			System.out.println("After Suite test Class A11");
		}
	
	

}
