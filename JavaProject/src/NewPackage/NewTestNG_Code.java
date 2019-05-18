package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestNG_Code {
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.out.println("During Test");
	  
  }
  @BeforeTest
  public void beforeTest() {


System.out.println("Before Test");	  
  }

  @AfterTest
  public void afterTest() {
	  
	System.out.println("After Test"); 
	 // driver.close();
	  
  }

}
