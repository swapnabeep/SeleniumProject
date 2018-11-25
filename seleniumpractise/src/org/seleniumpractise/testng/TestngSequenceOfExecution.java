package org.seleniumpractise.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngSequenceOfExecution {
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before Suite got called");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Test got called");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before Class got called");
	}
	
	@BeforeMethod
	public void setup(){
		System.out.println("Before Method got called");
	}
	@Test(groups = { "sanity" })
	public void test1(){
		System.out.println("this is test1 method ");
	}
	
	@Test(groups = { "regression" })
	public void test2(){
		System.out.println("this is test2 method ");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("After Method got called");
	}
	
	
	@AfterClass
	public void afterClass(){
		System.out.println("After class got called");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("After Test got called");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("After Suite got called");
	}
	
	
}
