package pack123;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class general {

	public static void main(String[] args) throws Exception
	{
		
		
		String path="C:\\Users\\Sachin\\Desktop\\Book1.xlsx";
		
		 FileInputStream file=new FileInputStream(path);
		
       Workbook book=WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("Details");
	    Row row =sheet.getRow(0);
		 Cell cell= row.getCell(0);
		 
		   String value= cell.getStringCellValue();
		
        System.out.println(value);
	}

}
