package com.AgileCrmAutomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.agilecrm.pages.LoginPage;

public class TestAnnotation extends BaseClass {
	@BeforeSuite
	public void beforeSuite() {
		launchBrowser("chrome");
    	driver.get("https://learnautomation.agilecrm.com");
		LoginPage loginpage=new LoginPage();
		loginpage.login("cst20@yopmail.com","Test1234");
	}
		@BeforeTest
		  public void beforeTest() {
			System.out.println("@BeforeTest");
		 
	}
		@BeforeClass
		  public void beforeClass() {
			System.out.println("@BeforeClass");
		}

	   @BeforeMethod
	      public void beforeMethod() {
		    System.out.println("@BeforeMethod");
	   }

	   @Test
	    public void test() {
		  System.out.println("@Test");
	     }
	
	  @AfterMethod
	   public void afterMethod() {
		System.out.println("@AfterMethod");
	}
	 @AfterClass
      public void afterClass() {
	   System.out.println("@AfterClass");
     }
	@AfterTest
    public void afterTest() {
	    System.out.println("@AfterTest");
  }
	@AfterSuite
      public void afterSuite() {
	    System.out.println("@AfterSuite");
	}
}
  	
	

  
  

