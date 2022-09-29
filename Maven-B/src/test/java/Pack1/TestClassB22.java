package Pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClassB22 {
	
		@BeforeSuite
		public void beforesuite() {
			System.out.println("Before Suite test Class A11");
		}

		@BeforeTest
		public void beforeTest() {
			System.out.println("Before Test Test Class B22");
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
		public void test1() {
			System.out.println("TEST 1");
		}
		
		@Test ()
		public void test2() {
			System.out.println("Test 2");
		}
		
		@Test
		public void test3() {
			System.out.println("Test 3");
		}
		
		@Test
		public void test4() {
			System.out.println("Test 4");
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
			System.out.println("After Test Test Class B22");
		
		}
		
		@AfterSuite
		public void aftersuite() {
			System.out.println("After Suite test Class A11");
		}
	
}
