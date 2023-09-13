package com.TestNgBasics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class assertionTest {
	
	@Test
	public void test1()
	{
		SoftAssert softAssert1=new SoftAssert();
		System.out.println("open browser");
		
		Assert.assertEquals(true,  true);//hard assertion
		
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click on sign in button");
		
		
		Assert.assertEquals(true,  true);//hard assertion
		
		System.out.println("validate Home Page");
		softAssert1.assertEquals(true,  false , "homepage title is missing");//soft assertion
		
		
		System.out.println("go to deals page");
		System.out.println("create a deal");
		System.out.println("go to contacts page");
		System.out.println("create a contact");
		
		softAssert1.assertAll();
		
	}
	@Test
	public void test2()
	{
		SoftAssert softAssert2=new SoftAssert();
		System.out.println("log out");
		softAssert2.assertEquals(true,  false);
		softAssert2.assertAll();
		
		
	}

}
