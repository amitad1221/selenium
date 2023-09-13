package com.test.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot  {
	public static WebDriver driver;
	
	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\eclipse-workspace\\LTI_JAVA\\pp1_via.com\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();  //launch chrome
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	
	public void failed(String testMethodName)
	{
		
		File SrcFile = 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile, new File("C:\\Users\\ASUS\\eclipse-workspace\\LTI_JAVA\\pp1_via.com\\resources\\screenshots\\"+testMethodName+"-"+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void termination()
	{
		driver.quit();
	}

}
