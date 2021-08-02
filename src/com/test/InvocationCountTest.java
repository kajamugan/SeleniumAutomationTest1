package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {
    
	@Test(invocationCount=100)      
	void sum() {
        	int a = 60;
        	int b = 40;
        	int c = a + b;
        	
        	System.out.println("Total : " + c);
        	
          }
}
