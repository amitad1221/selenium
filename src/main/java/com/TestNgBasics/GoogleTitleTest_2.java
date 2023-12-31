package com.TestNgBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class GoogleTitleTest_2 {
WebDriver driver;
	
	@BeforeMethod
	
	public void setUp()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\eclipse-workspace\\LTI_JAVA\\pp1_via.com\\resources\\chromedriver.exe");
		driver=new ChromeDriver();  //launch chrome
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	
	@Test()
	public void googleTitleTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals("title is not matched", "Google", title);
		
	
	}
	
	@Test(enabled=false)
	public void googleLogoTest()
	{
		boolean b=driver.findElement(By.xpath("//*[@id=\"logo\"]")).isDisplayed();
		Assert.assertTrue(b);
		//Assert.assertEquals(true, b);
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}

}
