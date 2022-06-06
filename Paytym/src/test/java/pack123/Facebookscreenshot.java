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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sun.org.apache.bcel.internal.classfile.Utility;

import utilies.ExcelDataConfig;

public class Facebookscreenshot {
	WebDriver driver;
	String testID;
	
	@Test(dataProvider="facebookData")
	public void faceboklaunch(String username, String password) throws EncryptedDocumentException, IOException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sachin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	 driver=new ChromeDriver();
	 testID="1221";
	 
	 driver.navigate().to("https://www.facebook.com/");
	 
	
	
     driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
    
     
	
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	  
	 
	
	}
	@DataProvider(name="facebookData")
	public Object[][]passdata()
	{
		ExcelDataConfig Config= new ExcelDataConfig("C:\\Users\\Sachin\\git\\Testing29janevening\\Paytym\\TestData\\InputData.xlsx");
		int rows= Config.getRowCount(0);
		
		Object[][] data=new Object[3][2];
		
		for(int i=0; i<rows; i++)
		{
			data[i][0]=Config.getData(0, i, 0);
			data[i][1]=Config.getData(0, i, 1);
		}
		return data;
	}
	
	}
	
	
	
	
/*	@AfterMethod()
	public void failsceenshot(ITestResult result) throws EncryptedDocumentException, IOException 
	{
		if(ITestResult.FAILURE== result.getStatus())
		{
			utilies.Utility.captureScreenshot(driver, testID);
		}
	}*/
	
