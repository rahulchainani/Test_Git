package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Backup on 6-4-19\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("uploadfile_0")).sendKeys("D:\\rahul\\pexels\\active-exercise-fit-1401796.jpg");
		
		
		
	}

}
