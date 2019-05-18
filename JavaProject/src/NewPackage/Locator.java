package NewPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Backup on 6-4-19\\Downloads\\Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techcanvass.com/");
		driver.manage().window().maximize();
		System.out.println("ffffff");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
		String a = driver.findElement(By.xpath("//*[@id=\"intro\"]/div[1]/h1")).getCssValue("color");
	
		System.out.println(a);
		
		Actions myAction = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 2);
		WebElement testlink;
		testlink = (WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Domain Training")));
		//WebElement ele = driver.findElement(By.linkText("Domain Training"));
		Thread.sleep(2000);
		
		myAction.moveToElement(testlink).build().perform();
		Thread.sleep(2000);
		
		WebElement Au = driver.findElement(By.linkText("Business Analyst + Domain courses"));
		
		

		Thread.sleep(2000);
		
		myAction.moveToElement(Au).build().perform();
		Thread.sleep(4000);
		
		WebElement Se = driver.findElement(By.linkText("BA Certification with Banking"));
		Se.click();
		Thread.sleep(3000);

		String b = driver.getTitle();
		
		Assert.assertEquals(b, "Business Analyst Training with Banking Domain");

	
	}
	
	

}
