package com.test;

import org.testng.annotations.Test;

public class ExceptionsTimeOutTest {
         
//	@Test(timeOut=2, expectedExceptions=NumberFormatException.class)
//	public void infinitToolTest() {
//		int i = 1;
//		while(i == 1) {
//		System.out.println(i);
//		}
//	}
		
	@Test(expectedExceptions=NumberFormatException.class)
	public void numberFormat() {
		String x = "1000AB";
		Integer.parseInt(x);
		
	}
}
