package com.TestNgBasics;

import org.testng.Assert;
import org.testng.annotations.Test;



public class RetryTests1 {
	
	@Test
	public void Test1()
	{
		Assert.assertEquals(false ,  true);
	}
	
	@Test
	public void Test2()
	{
		Assert.assertEquals(false ,  true);
	}
	
	@Test
	public void Test3()
	{
		Assert.assertEquals(true ,  true);
	}

}
