package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\blver\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
		
	@Test(priority = 1)
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google");
	}
	
	@Test(priority = 2)
	public void googleLogoTest() {
	     boolean b = driver.findElement(By.xpath("//*[@id='hpctaplay']")).isDisplayed();
	     Assert.assertTrue(b);
	}
		
	@AfterMethod
	public void tearDown() {
			driver.quit();
		}
}
