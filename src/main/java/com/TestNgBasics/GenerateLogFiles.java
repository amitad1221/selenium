package com.TestNgBasics;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class GenerateLogFiles {
	WebDriver driver;
	Logger log = Logger.getLogger(GenerateLogFiles.class);
	
@BeforeMethod
	
	public void setUp()
	{
		
		log.info("****************************** Starting test cases execution  *****************************************");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\git\\Via.com\\Selenium\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();  
		log.info("launching chrome broswer");
		driver.manage().window().maximize();
		
		
		driver.get("http://www.google.com");
		log.info("entering application URL");
		log.warn("Hey this just a warning message");
		log.fatal("hey this is just fatal error message");
		log.debug("this is debug message");
	}

@Test(priority=1)
public void GoogleTitleTest() {
	
	log.info("****************************** starting test case *****************************************");
	log.info("****************************** GoogleTitleTest *****************************************");
	String title = driver.getTitle();
	System.out.println(title);
	log.info("login page title is--->"+title);
	Assert.assertEquals(title, "Google");
	
	log.info("****************************** ending test case *****************************************");
	log.info("****************************** GoogleTitleTest *****************************************");
}


@AfterMethod
public void close()
{
	driver.quit();
	log.info("****************************** Browser is closed *****************************************");
}

}
