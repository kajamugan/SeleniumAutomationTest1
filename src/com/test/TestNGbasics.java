package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGbasics {
	
	//PRE-CONDITIONS ANNOTATIONS -- STARTING WITH @Before
    @BeforeSuite
    public void setUp() {
    	System.out.println("setup system property for chrome");
    }
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch chrome browser");
	}
	
	@BeforeClass
	public void enterURL() {
		System.out.println("enter URL");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("login to the app");
	}
	
	//TEST CASES -- STARTING WITH @Test
	@Test
	public void googleTitleTest() {
		System.out.println("google title test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("search test");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("google logo test");
	}
	
	//POST-CONDITIONS -- STARTING WITH @After
	@AfterMethod
	public void logOut() {
		System.out.println("logout from app");
	}
	
	@AfterClass
	public void deleteAllCookies() {
		System.out.println("delete all cookies");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("close browser");
	}
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("generate test report");
	}
	
	
}
