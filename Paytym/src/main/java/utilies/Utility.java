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
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility{
	XSSFWorkbook wb;
	 XSSFSheet sheet1;
	
	 public Utility(String excelPath) 
		{
			 try {
					File src=new File("C:\\Users\\Sachin\\Desktop\\Book1.xlsx");
						
					    FileInputStream fis=new FileInputStream(src);
							
					    XSSFWorkbook  wb= new XSSFWorkbook(fis);
					    
					    XSSFSheet  sheet1=  wb.getSheetAt(0);
				      } 
				         catch (IOException e) 
				       {
					     System.out.println(e.getMessage());
					   
				       }
		    }

		
			
	     public String getData(int sheetNumber, int row , int column)
	     {
	    	 sheet1=  wb.getSheetAt(0);
	    	 String data= sheet1.getRow(row).getCell(column).getStringCellValue();
	    	 
	    	 return data;
	     }
			    
		 
	  public int getRowCount(int sheetIndex)
	  {
		 int row= wb.getSheetAt(sheetIndex).getLastRowNum();
		 row=row+1;
		return row;
	  }
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	    
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
