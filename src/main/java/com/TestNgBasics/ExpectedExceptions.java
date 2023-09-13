package com.TestNgBasics;

import org.testng.annotations.Test;

public class ExpectedExceptions {
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1()
	{
		String s="100A";
		Integer.parseInt(s);
	}

}
