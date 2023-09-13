package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.baseClass.TestBase;
import com.qa.pages.BusPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestUtil;

public class BusPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	BusPage busPage;
	String sheetName = "Sheet1";
	
	
	public BusPageTest(){
			super();
			
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		
		busPage = new BusPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		busPage = homePage.clickOnBusLink();
	}
	
	@Test(priority=1)
	public void verifyBusPageLabelTest(){
		Assert.assertTrue(busPage.verifyBusPageLabel(), "Bus page label is missing on the page");
	}
	
	@Test(priority=2)
	public void clickOnRoundTripTest(){
		busPage.clickonRoundTrip();
		
	}
	
	@DataProvider
	public Object[][] getViaTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	
	
	@Test(priority=3, dataProvider="getViaTestData")
	public void bookYourBusTest(String pickup , String destination){
		homePage.clickOnBusLink();
		busPage.bookYourBus(pickup , destination);
		
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	

}
