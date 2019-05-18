package com.techcanvass.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LMSLandingPage {
	
	
	@FindBy(name = "txtLoginid")
	WebElement nameParam;
	
	//By NamePar = By.name("txtLoginid");
	
	@FindBy(name = "txtpassword")
	WebElement PassParam;
	
	//By PassPar = By.name("txtpassword");
	
	
	@FindBy(name = "btnLogin")
	WebElement ClickParam;
	//By ClickPar = By.name("btnLogin");
	
	//public void setlmsuser(WebDriver d, String user)
	public void setlmsuser(String user)

	{
		
	//d.findElement(NamePar).sendKeys(user);
		nameParam.sendKeys(user);
	}

	//public void setlmspassword(WebDriver d, String password)
	public void setlmspassword(String password)
	{
		
	//d.findElement(PassPar).sendKeys(password);
		PassParam.sendKeys(password);
	}
	
	//public void clickSave(WebDriver d)
	
	
		public void clickSave()	
		{
		//d.findElement(ClickPar).click();
		
		ClickParam.click();
	}	
	

}
