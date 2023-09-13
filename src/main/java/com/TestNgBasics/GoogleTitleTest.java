package com.TestNgBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\eclipse-workspace\\LTI_JAVA\\pp1_via.com\\resources\\chromedriver.exe");
		driver=new ChromeDriver();  //launch chrome
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test(priority=1,groups="title")
	public void googleTitleTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=2,groups="logo")
	public void googleLogoTest()
	{
		boolean b=driver.findElement(By.xpath("//*[@id=\"logo\"]")).isDisplayed();
	}
	@Test(priority=3,groups="test")
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(priority=4,groups="test")
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(priority=5,groups="test")
	public void test3()
	{
		System.out.println("test3");
	}
	@Test(priority=6,groups="test")
	public void test4()
	{
		System.out.println("test4");
	}


	
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}

}
