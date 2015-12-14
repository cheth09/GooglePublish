package playStorePackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import atu.testng.reports.ATUReports;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import atu.testng.reports.logging.LogAs;
import atu.testng.reports.utils.Utils;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class,
MethodListener.class })

public class ReadDataFromExcel {
	{

		File file = new File("atu.properties");
		System.setProperty("atu.reporter.config",file.getAbsolutePath());
}
	Operation opt;
	WebDriver wd;
	WebDriverWait wait;


	boolean flag=true;

	int rowIndex;
	String storeListingsheetName,loginsheetName,switchcase,fileName;
	Sheet excelSheet,sheetPag;
	

	int a[]= new int[100];
	String FilePath = System.getProperty("user.dir")+"\\assets\\StoreListing.xlsx";

	@BeforeSuite
	public void init()throws Exception {
		
		SelectBrowserToRun.getInstance().setCurrentDriverToFireFox();
		opt = new Operation();

     
		//maximize the screen
		SelectBrowserToRun.getInstance().getDriver().manage().window().maximize();
		
		fileName = "StoreListing.xlsx";
		loginsheetName = "Login";
		Sheet readWebsiteURL = readExcel(FilePath, fileName, loginsheetName);
		SelectBrowserToRun.getInstance().getDriver().get(readWebsiteURL.getRow(1).getCell(2).getStringCellValue());
	    ATUReports.add("Webpage opened", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		ATUReports.setWebDriver(wd);
		ATUReports.indexPageDescription = "Play Store Test Result";
		ATUReports.setAuthorInfo("Sukesh Bolar", Utils.getCurrentTime(),"1.0");
	}
	
	@Test(priority = 0)
	public void Login() throws Exception,NullPointerException{
		
		fileName = "StoreListing.xlsx";
		loginsheetName = "Login";
		switchcase=loginsheetName;
		sheetPag= readExcel(FilePath,fileName,loginsheetName);

		//Method call to read the Cell Values
		retrieveExcelCellValues(sheetPag, fileName, loginsheetName);
	}
	
	@Test(priority = 1)
	public void StoreListing() throws Exception,NullPointerException{

		//String Name = "StoreListing.xlsx";
		storeListingsheetName = "StoreListing";
		switchcase=storeListingsheetName;

		sheetPag = readExcel(FilePath,fileName, storeListingsheetName);

		//Method call to read the Cell Values
		retrieveExcelCellValues(sheetPag, fileName,storeListingsheetName);
	}

	@Test
	public int retrieveNoOfRows(Sheet excelSheet,String Name) {
		int rowCount = excelSheet.getLastRowNum()-excelSheet.getFirstRowNum();
		return rowCount;
	}


	public int retrieveNoOfColumns(Sheet excelSheet,String Name){
		int colCount = excelSheet.getRow(0).getPhysicalNumberOfCells();
		return colCount;
	}

	
	public void retrieveExcelCellValues(Sheet excelSheet,String Name,String sheetString) throws Exception
	{
		
		
		int colHeaderCount=0;
		//opt = new Operation(SelectBrowserToRun.getInstance().getDriver());

		//Find number of rows in excel file
		int rowCount = retrieveNoOfRows(excelSheet, Name);

		//Find number of columns in excel file
		int colCount = retrieveNoOfColumns(excelSheet, Name);

		String excelData[][] = new String[rowCount+1][colCount+1];
		String headerData[][]= new String[rowCount+1][colCount+1];

		int headerRowIndex,headerColIndex;
		int colIndex = 0,rowNum;
		int a[]= new int[100];

		// Validating header values(First row of the Sheet)
		for(headerRowIndex = 0; headerRowIndex<1 ; headerRowIndex++)
		{
			for(headerColIndex = 0; headerColIndex<colCount; headerColIndex++)
			{
				//fetching cell value
				Row row = excelSheet.getRow(headerRowIndex);


				//Check for cell value empty or not
				if(row.getCell(headerColIndex).toString()!= null){

					//headerData contains header elements
					headerData[headerRowIndex][headerColIndex]=  row.getCell(headerColIndex).toString();
					a[colHeaderCount]=headerColIndex;		
					colHeaderCount++;
					//System.out.println(headerData[headerRowIndex][headerColIndex]);
				}
				else
				{
					System.out.println("Seems like there is some value missing in the First row of your excel sheet: " + switchcase+"!! Please Check again");
					break;
				}
			}
		}

			for(rowNum = 1; rowNum<=rowCount ; rowNum++)
			{
				for(colIndex = 0; colIndex<colCount; colIndex++)
				{
					Row row = excelSheet.getRow(rowNum);

					//Check for cell value empty or not
					if(row.getCell(colIndex).toString() != null){
						excelData[rowNum][colIndex]= row.getCell(colIndex).toString();

					}
				}
			}

		opt.performOperation(excelData,rowCount,colCount,headerData,colHeaderCount,switchcase);

	}
	
	@AfterSuite
	public void SendFinalReport()
	{
		
		SendMailReport();
	}

	@SuppressWarnings({ "resource", "resource" })
	public Sheet readExcel(String filePath2,String fileName,String sheetName) throws IOException{

		//Create a object of File class to open xlsx file
		File file =	new File(filePath2);
		
		//Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);
		Workbook excelformat = null;
		
		//Find the file extension by spliting file name in substing and getting only extension name
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		
		//Check condition if the file is xlsx file
		if(fileExtensionName.equals(".xlsx")){
			//If it is xlsx file then create object of XSSFWorkbook class
			excelformat = new XSSFWorkbook(inputStream);
		}
		//Check condition if the file is xls file
		else if(fileExtensionName.equals(".xls")){
			//If it is xls file then create object of XSSFWorkbook class
			excelformat = new HSSFWorkbook(inputStream);
		}
		
		//Read sheet inside the workbook by its name
		Sheet  format = excelformat.getSheet(sheetName);
		//excelformat.close();
		return format;	
	}

	public void SendMailReport()
	{
	
	  try {
		  ProcessBuilder pb = new ProcessBuilder("MailReport.bat");
		  //Map<String, String> env = pb.environment();
		  Process p = pb.start();
		  //p.waitFor();
		  BufferedReader buf = new BufferedReader(new InputStreamReader(
		  p.getInputStream()));
		  String line = "";
		  while ((line = buf.readLine()) != null) {
		  System.out.println(line);
		  }
		  } catch (Exception e) {
		  e.printStackTrace();
		  }
	}
}
