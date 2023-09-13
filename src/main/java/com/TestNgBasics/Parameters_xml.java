package com.TestNgBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_xml {
WebDriver driver;
	
	@Test()
	@Parameters({"env" , "browser" , "url" , "emailid"})
	public void flipkart(String env, String browser , String url , String emailid)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\eclipse-workspace\\LTI_JAVA\\pp1_via.com\\resources\\chromedriver.exe");
			driver=new ChromeDriver();  
			driver.manage().window().maximize();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\ASUS\\eclipse-workspace\\LTI_JAVA\\pp1_via.com\\resources\\geckodriver.exe");
			driver=new FirefoxDriver();  
			driver.manage().window().maximize();
		}
		driver.get(url);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(emailid);  //enter username
		
		
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}


}
