
package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	
	@FindBy(xpath="//*[@id=\"wzrk-cancel\"]")
	WebElement popUp;
	
	@FindBy(xpath="//*[@id=\"SignIn\"]/div")
	WebElement signinBtn;
	
	@FindBy(xpath="//*[@id=\"loginIdText\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"passwordText\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"loginValidate\"]")
	WebElement loginBtn;
	
	
	@FindBy(xpath="//*[@id=\"header\"]/div/div[2]/div[1]/a[1]/img")
	WebElement viaLogo;
		
		
		//Initializing the Page Objects:
		public LoginPage() //constructor of LoginPage class
		{
			PageFactory.initElements(driver, this);  //all the web elements defined above will be initialized with driver
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateviaImage(){
			return viaLogo.isDisplayed();
		}
		
		public HomePage login(String un, String pwd){
			
			popUp.click();
			signinBtn.click();
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
			    	
			    	
			return new HomePage();
		}
		

}
