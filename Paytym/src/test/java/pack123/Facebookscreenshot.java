package pack123;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.sun.org.apache.bcel.internal.classfile.Utility;

public class Facebookscreenshot {
	WebDriver driver;
	
	
	@Test
	public void faceboklaunch()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	 driver=new ChromeDriver();
	
	driver.navigate().to("https://www.facebook.com/");
			
	
	
     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sachinvarade3010@gmail.com");
     
     
	
	 driver.findElement(By.xpath("//input[@typeq='password']")).sendKeys("sachin");
	
	 
	
	}
	 @AfterMethod
	    public void reardown(ITestResult result) throws EncryptedDocumentException, IOException
	    {
		 if(ITestResult.FAILURE==result.getStatus())
		 {
			 utilies.Utility.captureScreenshot(driver, result.getName());
		 }
		 driver.quit();
	    }
}
