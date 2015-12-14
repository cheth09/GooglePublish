package playStorePackage;

import java.io.File;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Sheet;
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

public class PlayStore_APK_Upload {
	{
		File file = new File("atu.properties");
		System.setProperty("atu.reporter.config",file.getAbsolutePath());
	}
	
	WebDriver wd;
	WebDriverWait wait;
	String storeListingsheetName,loginsheetName,switchcase,fileName;
	Sheet sheetPag;
	String FilePath = System.getProperty("user.dir")+"\\assets\\StoreListing.xlsx";
	
	@BeforeSuite
	public void setBrowserToExecute() throws Exception{
		SelectBrowserToRun.getInstance().setCurrentDriverToChrome();
		//SelectBrowserToRun.getInstance().setCurrentDriverToFireFox();
		SelectBrowserToRun.getInstance().getDriver().manage().window().maximize();
		fileName = "StoreListing.xlsx";
		loginsheetName = "Login";
		Sheet readWebsiteURL = CCReadExcel.readExcel(FilePath, fileName, loginsheetName);
		SelectBrowserToRun.getInstance().getDriver().get(readWebsiteURL.getRow(1).getCell(2).getStringCellValue());
	    ATUReports.add("Webpage opened", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		ATUReports.setWebDriver(wd);
		ATUReports.indexPageDescription = "Play Store Test Result";
		ATUReports.setAuthorInfo("Sukesh Bolar", Utils.getCurrentTime(),"1.0");
		login();
		storeListingSetUp();
	}
	
	
	public void login() throws Exception {
		fileName = "StoreListing.xlsx";
		loginsheetName = "Login";
		switchcase=loginsheetName;
		sheetPag= CCReadExcel.readExcel(FilePath,fileName,loginsheetName);
		//Method call to read the Cell Values
		CCRetrieveExcelValue.retrieveExcelCellValues(sheetPag, fileName, loginsheetName,switchcase);

	}
	public void storeListingSetUp() throws Exception{
		fileName = "StoreListing.xlsx";
		loginsheetName = "StoreListing";
		switchcase=loginsheetName;
		sheetPag= CCReadExcel.readExcel(FilePath,fileName,loginsheetName);
		//Method call to read the Cell Values
		CCRetrieveExcelValue.retrieveExcelCellValues(sheetPag, fileName, loginsheetName,switchcase);
	}
	
	@AfterSuite
	public void SendFinalReport()
	{
		
		CCSendReport.SendMailReport();
	}
}
