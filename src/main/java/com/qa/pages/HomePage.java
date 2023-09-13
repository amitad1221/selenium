package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath = "//*[@id=\"header\"]/div/div[2]/div[1]/a[2]")
	WebElement hompePageLogo;

	@FindBy(xpath = "//*[@id=\"Bus\"]/a/span[2]")
	WebElement bus;
	
	@FindBy(xpath = "//*[@id=\"Cabs\"]/a/span[2]")
	WebElement cabs;
	

	@FindBy(xpath = "//*[@id=\"Cruise\"]/a/span[2]")
	WebElement cruise;

	@FindBy(xpath = "//*[@id=\"Hotels\"]/a/span[2]")
	WebElement hotels;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
	public boolean verifyHomePageLogo(){
		return hompePageLogo.isDisplayed();
	}
	
	public BusPage clickOnBusLink(){
		bus.click();
		return new BusPage();
	}
	
	public CabsPage clickOnCabsLink(){
		cabs.click();
		return new CabsPage();
	}
	
	public CruisePage clickOnCruiseLink(){
		cruise.click();
		return new CruisePage();
	}
	
	public HotelsPage clickOnHotelsLink(){
		hotels.click();
		return new HotelsPage();
	}
	
	

}
