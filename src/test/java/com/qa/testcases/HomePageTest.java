package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseClass.TestBase;
import com.qa.pages.BusPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	BusPage busPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		busPage=new BusPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Book Flights, Hotels, Bus and Holiday Packages Online - Via.com","Home page title not matched");
	}
	
	@Test(priority=2)
	public void verifyHomePageLogoTest(){
		boolean flag =homePage.verifyHomePageLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void verifyBusLinkTest(){
		
		busPage = homePage.clickOnBusLink();
	}
	
	
	
    @AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	

}
