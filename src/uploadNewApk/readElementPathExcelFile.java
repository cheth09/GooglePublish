package uploadNewApk;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readElementPathExcelFile {
	@Test
	  public Sheet ElementPath(String countryFilePath,String fileName,String sheetName) throws Exception {
		//Create a object of File class to open xlsx file
			File file =	new File(countryFilePath);
			
			//Create an object of FileInputStream class to read excel file
			FileInputStream inputStream = new FileInputStream(file);
			Workbook excelformat = null;
			excelformat = new XSSFWorkbook(inputStream);
			Sheet  format = excelformat.getSheet(sheetName);
			//excelformat.close();
			 return format;	
	  }
}
