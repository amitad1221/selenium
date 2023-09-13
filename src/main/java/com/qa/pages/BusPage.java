package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.baseClass.TestBase;

public class BusPage extends TestBase {
	@FindBy(xpath = "//*[@id=\"busSearchBox\"]/header/h1")
	WebElement busPageLabel;
	
	@FindBy(xpath = "//*[@id=\"busSearchBox\"]/header/ul/li[2]/a")
	WebElement roundTrip;
	
	@FindBy(xpath = "//*[@id=\"src\"]")
	WebElement from;
	
	@FindBy(xpath = "//*[@id=\"dest\"]")
	WebElement to;
	
	// Initializing the Page Objects:
		public BusPage() {
			PageFactory.initElements(driver, this);
		}
		
		
		public boolean verifyBusPageLabel(){
			return busPageLabel.isDisplayed();
		}
		
		public void clickonRoundTrip()
		{
			roundTrip.click();
		}
		
		public void bookYourBus(String pickup, String destination){
			
			from.sendKeys(pickup);
			to.sendKeys(destination);
			
		}
	
	
	
	
	

}
