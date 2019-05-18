package new_Package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.techcanvass.pages.LMSLandingPage;

public class Excel_Read {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Backup on 6-4-19\\Downloads\\Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://lms.techcanvass.co.in/");
		
		FileInputStream fs = new FileInputStream("D:\\rahul\\Techcanvass\\Test Data.xls");
		HSSFWorkbook hw = new HSSFWorkbook(fs);
		HSSFSheet hs = hw.getSheetAt(0);
		LMSLandingPage myPage = PageFactory.initElements(d, LMSLandingPage.class);

		
		
		
		for(int i = 1; i<= hs.getLastRowNum(); i++)
		{
			
			int j=1;
			HSSFCell id, password;
			id = hs.getRow(i).getCell(j);
			password = hs.getRow(i).getCell(j+1);
			
			myPage.setlmsuser(id.toString());
			//System.out.println(id);
			myPage.setlmspassword(password.toString());
			myPage.clickSave();
			//System.out.println(password);
			
			//d.findElement(By.name("txtLoginid")).sendKeys(id.toString());
			//d.findElement(By.id("txtpassword")).sendKeys(password.toString());
			//d.findElement(By.name("btnLogin")).click();

			Thread.sleep(2000);
			
		d.switchTo().alert().accept();
		
		d.findElement(By.name("txtLoginid")).clear();
		d.findElement(By.id("txtpassword")).clear();
		}
		
		hw.close();

	}

}
