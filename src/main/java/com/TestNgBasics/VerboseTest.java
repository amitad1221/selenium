package com.TestNgBasics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerboseTest {
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
	
	@Test()
	public void googleTitleTest1()
	{
		
		System.out.println("title of the page is google");
	}
	public void googleTitleTest2()
	{
		
		System.out.println("title of the page is google");
	}
	public void googleTitleTest3()
	{
		
		System.out.println("title of the page is google");
	}
		
	
	
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}


}
