package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {

	@Test
	public void loginTest() {
		System.out.println("login test");
		//int x = 10/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void homePageTest() {
		System.out.println("home page test");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void searchPageTest() {
		System.out.println("search page test");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void regPageTest() {
		System.out.println("registration page test");
	}
	
	
}
