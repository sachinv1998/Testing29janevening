package utilies;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;




public class Utility {
	    
	public static void captureScreenshot(WebDriver driver , String screenshotName ) throws EncryptedDocumentException, IOException 
	{
		
		
		try {
			DateFormat dateformat=new SimpleDateFormat("MM/dd/YYYY HH:mm:ss");		
			Date date=new Date();		
			String date1=dateformat.format(date);
			
		
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("C:\\Users\\Sachin\\OneDrive\\Pictures/"+screenshotName+".png"));
		} 
		
		
		catch (Exception e) {
			
			System.out.println("exception while taking "+e.getMessage());
			e.printStackTrace();
		}
	
	}
		  
		
		
	    
		
		
		
		
		
		
		
		
		
		
		

		
	
	
	
	

}
