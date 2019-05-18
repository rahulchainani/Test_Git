package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\Backup on 6-4-19\\Downloads\\Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techcanvass.com/");
		driver.manage().window().maximize();
		
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
  }
}
