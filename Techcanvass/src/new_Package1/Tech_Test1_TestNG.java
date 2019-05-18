package new_Package1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Tech_Test1_TestNG {
	
 WebDriver driver;



  @Test
  public void f() throws InterruptedException {
	  //System.out.println("In Progress");
	  
	  
		
		Actions myAction = new Actions(driver);
		
		WebElement ele = driver.findElement(By.linkText("Domain Training"));
		Thread.sleep(2000);
		
		myAction.moveToElement(ele).build().perform();
		Thread.sleep(2000);
		
		WebElement Au = driver.findElement(By.linkText("Business Analyst + Domain courses"));
		Thread.sleep(2000);
		
		myAction.moveToElement(Au).build().perform();
		Thread.sleep(2000);
		
		WebElement Se = driver.findElement(By.linkText("BA Certification with Banking"));
		Se.click();
		

		String b = driver.getTitle();
		
		Assert.assertEquals(b, "Business analyst training with Banking Domain");
	
	  
  }
  @BeforeTest
  public void beforeTest() {
	  //System.out.println("Before Start");
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\Backup on 6-4-19\\Downloads\\Selenium\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techcanvass.com/");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
	  //System.out.println("After Stop");
	  
	  driver.close();
  }

}
