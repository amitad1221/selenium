package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;  //reference variable which is the object
	
	public LoginPageTest(){   //creating a constructor to initialize the superclass constructor property
		super();             //super() -it will call the superclass(parent class i.e TestBase class) constructor ,in this case TestBase class constructor i.e public TestBase() to initialize it's property 
	}    
	
	
	@BeforeMethod
	public void setUp(){
		initialization();  //since initialization() method is defined as static so without creating an object also we can call this method
		loginPage = new LoginPage();
		
}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Book Flights, Hotels, Bus and Holiday Packages Online - Via.com");
	}
	
	@Test(priority=2)
	public void viaLogoImageTest(){
		boolean flag = loginPage.validateviaImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password")); 
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
