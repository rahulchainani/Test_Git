package LMSPAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LMSHomePage {
	
	public void setlmsuser(WebDriver d, String user)
	{
	
	d.findElement(By.name("txtLoginid")).sendKeys(user);
	}

	public void setlmspassword(WebDriver d, String password)
	{
	
	d.findElement(By.name("txtpassword")).sendKeys(password);
	}
	
	public void clickSave(WebDriver d)
	{
	
		d.findElement(By.name("btnLogin")).click();
	}	
	
}
