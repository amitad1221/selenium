package com.TestNgBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.test.utilities.ScreenShot;

@Listeners(com.listeners.CustomListener.class)

public class ScreenShotTest extends ScreenShot {
	WebDriver driver;
	
@BeforeMethod
	
	public void setUp()
	{
		initialization();
	}




@Test
public void takeScreenShotTest1()
{
	
	Assert.assertEquals(false , true);
}

@Test
public void takeScreenShotTest2()
{
	
	Assert.assertEquals(false , true);
}

@Test
public void takeScreenShotTest3()
{
	
	Assert.assertEquals(false , true);
}



@AfterMethod
public void close()
{
	termination();
}


}
