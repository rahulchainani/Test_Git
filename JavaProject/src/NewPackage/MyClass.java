package NewPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "E:\\Backup on 6-4-19\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://google.com");
		
		//int a = 10;
		//int b = 20;
		/*int c = a+b;
		
		
		
		System.out.println("the addition of a and b is " +c);*/
		
	}

}
