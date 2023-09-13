package com.TestNgBasics;

import org.testng.annotations.Test;

public class dependsOnMethods {
	@Test
	public void loginTest()
	{
		System.out.println("login test");
		int i=9/0;
	}
	@Test(dependsOnMethods="loginTest")
	public void homePageTest()
	{
		System.out.println("homepage test");
	}

}
