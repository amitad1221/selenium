package com.TestNgBasics;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utilities.testUtil;

public class DataDrivenFrameworkBasics {
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
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData()
	{
		ArrayList<Object[]> testData= testUtil.getDataFromExcel();
		return testData.iterator();
	}
	
	@Test(dataProvider="getTestData")
	public void loginpagetest(String username, String password)
	{
		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).sendKeys(username);
		
		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).sendKeys(password);
		
		
		
		
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}

}
