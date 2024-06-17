package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	
public static String getExcelData(int row,int cell) throws EncryptedDocumentException, IOException  {
		
	FileInputStream file =  new FileInputStream("C:\\Users\\Administrator\\Desktop\\selenium.xlsx");
//WorkbookFactory means excel file	
   String value  =  WorkbookFactory.create(file ).getSheet("selenium").getRow(0).getCell(0).getStringCellValue();
	
	System.out.println( value );
	
	return value;
	
	}

}
