package playStorePackage;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import functions.Function;

import uploadNewApk.readElementPathExcelFile;

import atu.testng.reports.ATUReports;
import atu.testng.reports.logging.LogAs;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;

public class Operation {
	String fileName,sheetName,autoitExePath;

	URL autoit;
	int colIndexCount = 0, functionHeaderCount, strategyHeaderCount,idStringHeaderCount, param1HeaderCount,countriesToPublish,buildUploadType,sevenInchCount,sevenInchTotalCount,whatsNewInThisVersionText,PhoneScreenshots,teninchTotalCount;
	int rowIndexCount,privacyPolicy, param2HeaderCount,shortDescriptionCount,fullDescriptionCount,applicationType,category,contentRating,phoneTotalCount,teninchScreenshots;
	

	ReadDataFromExcel readExcelValues = new ReadDataFromExcel();
	selectCountries country = new selectCountries(SelectBrowserToRun.getInstance().getDriver());

	//	URL Path = Thread.currentThread().getContextClassLoader().getResource("StoreListing.xlsx");
	//	String FilePath = Path.getPath();

//	public Operation(WebDriver SelectBrowserToRun.getInstance().getDriver()) {
//		this.SelectBrowserToRun.getInstance().getDriver() = SelectBrowserToRun.getInstance().getDriver();
//
//	}



	@Test
	public  void performOperation(String[][] excelData, int rowCount,int colCount, String a[][], int colHeaderCount,String operation) throws NullPointerException, Exception 
	{


		readElementPathExcelFile readElement = new readElementPathExcelFile();
		String switchCase = operation;
		SelectBrowserToRun.getInstance().getDriver();

		// reading Element path file
		fileName = "StoreListing";
		sheetName = "Identification_Strategy";

		Sheet element = readElement.ElementPath(readExcelValues.FilePath, fileName, sheetName);
		//Sheet element= readExcelValues.readExcel(readExcelValues.FilePath, fileName, sheetName);

		WebDriverWait wait = new WebDriverWait(SelectBrowserToRun.getInstance().getDriver(), 120);
		String names[][] = new String[100][100];
		Function function = new Function(SelectBrowserToRun.getInstance().getDriver(),wait);

		// reading array values
		for (int rowIndex = rowCount; rowIndex <= rowCount; rowIndex++) {
			for (int colIndex = 0; colIndex < colCount; colIndex++) {

				names[rowIndex][colIndex] = excelData[rowIndex][colIndex];
				//	System.out.println("Second step");
				//	System.out.println(names[rowIndex][colIndex]);
			}
			rowIndexCount = rowIndex;
		}

		for (int headerCount = 0; headerCount < 1; headerCount++) {
			for (int colIndex = 0; colIndex < colCount; colIndex++) {
				if (a[headerCount][colIndex].equals("UserName")) {
					functionHeaderCount = colIndex;
				} else if (a[headerCount][colIndex].equals("Password")) {
					strategyHeaderCount = colIndex;
				} else if (a[headerCount][colIndex].equals("Language")) {
					idStringHeaderCount = colIndex;
				} else if (a[headerCount][colIndex].equals("Title")) {
					param1HeaderCount = colIndex;
				} else if (a[headerCount][colIndex].equals("ShortDescription")) {
					shortDescriptionCount = colIndex;
				}else if (a[headerCount][colIndex].equals("FullDescription")) {
					fullDescriptionCount = colIndex;
				}else if (a[headerCount][colIndex].equals("ApplicationType")) {
					applicationType = colIndex;
				}else if (a[headerCount][colIndex].equals("Category")) {
					category = colIndex;
				}else if (a[headerCount][colIndex].equals("ContentRating")) {
					contentRating = colIndex;
				}else if (a[headerCount][colIndex].equals("PrivacyPolicy")) {
					privacyPolicy = colIndex;
				}else if (a[headerCount][colIndex].equals("CountriesToPublish")) {
					countriesToPublish = colIndex;
				}else if (a[headerCount][colIndex].equals("BuildUploadType")) {
					buildUploadType = colIndex;
				}else if (a[headerCount][colIndex].equals("SevenInchScreenShot")) {
					sevenInchCount = colIndex;
				}else if(a[headerCount][colIndex].equals("PhoneScreenshots")) {
					PhoneScreenshots = colIndex;
				}else if(a[headerCount][colIndex].equals("teninchScreenshots")) {
					teninchScreenshots = colIndex;
				}

			}

		}
		String value = switchCase.toUpperCase();
		switch (value) {
		case "LOGIN": {

			try
			{
				//Entering email address
				ATUReports.add("Enter the Email Address", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				function.clickById(element.getRow(1).getCell(2).getStringCellValue());
				SelectBrowserToRun.getInstance().getDriver().findElement(By.id(element.getRow(1).getCell(2).getStringCellValue())).sendKeys(names[rowIndexCount][functionHeaderCount]);
				ATUReports.add("Email Address is entered", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

				//Click Next button
				function.clickById(element.getRow(83).getCell(2).getStringCellValue());
				function.waitForElementByXpath(element.getRow(2).getCell(2).getStringCellValue());
				
				//Entering password
				ATUReports.add("Enter the Password", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				function.clickByXpath(element.getRow(2).getCell(2).getStringCellValue());
				function.clearByXpath(element.getRow(2).getCell(2).getStringCellValue());
				SelectBrowserToRun.getInstance().getDriver().findElement(By.xpath(element.getRow(2).getCell(2).getStringCellValue())).sendKeys(names[rowIndexCount][strategyHeaderCount]);
				ATUReports.add("Password is entered", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

				//click login button
				ATUReports.add("Click on Login Button", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				SelectBrowserToRun.getInstance().getDriver().findElement(By.xpath(element.getRow(3).getCell(2).getStringCellValue())).click();
				ATUReports.add("Login button is clicked", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

				//wait till screen loads successfully
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'Add new application')]")));
				if (SelectBrowserToRun.getInstance().getDriver().findElement(By.xpath(element.getRow(4).getCell(2).getStringCellValue())).isDisplayed() == true) {
					ATUReports.add("Login successfull", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				} else {
					ATUReports.add("Login Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				}
			}
			catch(Exception e)
			{
				ATUReports.add("Login Failed for some reason!!", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
			break;
		}

		case "STORELISTING" : {

			try{
				//click ADD NEW APPLICATION button
				ATUReports.add("Click on Add new Application button", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				function.clickByXpath(element.getRow(4).getCell(2).getStringCellValue());
				ATUReports.add("Add new Application button is clicked", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
			catch(Exception e){
				ATUReports.add("Failed to create new Application", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}

			//Wait for Add New Application UI to load
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element.getRow(6).getCell(2).getStringCellValue())));

			try
			{
				//code to select language
				ATUReports.add("Select the Language", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				By xpath = By.xpath(element.getRow(7).getCell(2).getStringCellValue());
				WebElement findElement = SelectBrowserToRun.getInstance().getDriver().findElement(xpath);
				Select select = new Select(findElement);
				select.selectByVisibleText(names[rowIndexCount][idStringHeaderCount]);
				ATUReports.add("Language is selected", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

				//waiting for application title field - drop down list to close
				ATUReports.add("Waiting for the Google Console to create the new Application", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				function.waitForElementByXpath(element.getRow(8).getCell(2).getStringCellValue());
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element.getRow(7).getCell(2).getStringCellValue())));

				//Application Title
				ATUReports.add("Enter the Application Title", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				function.clickByXpath(element.getRow(8).getCell(2).getStringCellValue());
				SelectBrowserToRun.getInstance().getDriver().findElement(By.xpath(element.getRow(8).getCell(2).getStringCellValue())).sendKeys(names[rowIndexCount][param1HeaderCount]);
				ATUReports.add("Application Title is entered", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));


				//Clicking on Upload New APK button.
				ATUReports.add("Click on Upload button", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				function.clickByXpath(element.getRow(32).getCell(2).getStringCellValue());
				ATUReports.add("Upload button is Clicked", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				Thread.sleep(5000);
			}
			catch(Exception e){
				ATUReports.add("Some Details might be missed out while creating new Application. Re-Check and run the script again", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}

			String autoitSheet = "Autoitscripts";
			Sheet autoitscript = null;
			
			try{
			ATUReports.add("Intializing the AutoIt script", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			//Get the URL of the autoit script .exe path
			
			autoitscript = readElement.ElementPath(readExcelValues.FilePath, fileName, autoitSheet);

			autoitExePath = System.getProperty("user.dir")+"\\assets\\"+ autoitscript.getRow(1).getCell(1).getStringCellValue();
			
			//autoitExePath = Thread.currentThread().getContextClassLoader().getResource(autoitscript.getRow(1).getCell(1).getStringCellValue()).getPath();
		
			//String cmd = Thread.currentThread().getContextClassLoader().getResource(autoitscript.getRow(1).getCell(2).getStringCellValue()).getPath();
			String cmd = System.getProperty("user.dir")+"\\assets\\"+ autoitscript.getRow(1).getCell(2).getStringCellValue();
			System.out.println("path of the apk : "+cmd);
			System.out.println("path of the autoitscript : "+autoitExePath);
			String paramSent = autoitExePath+" "+cmd;

			Runtime.getRuntime().exec(paramSent);
			}
			catch(Exception e){
				ATUReports.add("AutoIt script failed to initiate", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				e.printStackTrace();
			}

			try
			{
				System.out.println("Start uploading apk");
				ATUReports.add("Start to Upload new Apk", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				if(names[rowIndexCount][buildUploadType].toUpperCase().matches("PRODUCTION")){
					ATUReports.add("Upload new apk to Production", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				//	function.waitForElementByXpath(element.getRow(85).getCell(2).getStringCellValue());
				//	function.waitForElementByXpath("//div[contains(@class,'KIWCRCC-b-j')]");
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button/div[contains(@class,'KIWCRCC-b-j')]")));
					
//					try{
//						function.waitForElementByXpath("//button[contains(@id,'gwt-uid-220')]");
//						function.clickByXpath("//button[contains(@id,'gwt-uid-220')]");
//					}catch(Exception e){
//						function.waitForElementByXpath("//button[contains(@id,'gwt-uid-778')]");
//						function.clickByXpath("//button[contains(@id,'gwt-uid-778')]");
//					}
					
					function.clickByXpath("//button/div[contains(@class,'KIWCRCC-b-j')]");
					function.uploadByXpath(element.getRow(36).getCell(2).getStringCellValue(),autoitExePath);
					function.waitForElementByXpath(element.getRow(82).getCell(2).getStringCellValue());
					ATUReports.add("Apk is Uploaded to Production", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				}else if(names[rowIndexCount][buildUploadType].toUpperCase().matches("BETA")){

					ATUReports.add("Upload new apk to Beta", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
					function.clickByXpath(element.getRow(37).getCell(2).getStringCellValue());
					function.waitForElementByXpath(element.getRow(84).getCell(2).getStringCellValue());
					function.clickByXpath(element.getRow(84).getCell(2).getStringCellValue());
					function.uploadByXpath(element.getRow(36).getCell(2).getStringCellValue(),autoitExePath);
					Thread.sleep(500);
					function.waitForElementByXpath(element.getRow(48).getCell(2).getStringCellValue());
					ATUReports.add("Apk is Uploaded to Beta", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

				}else if(names[rowIndexCount][buildUploadType].toUpperCase().matches("ALPHA")){
					ATUReports.add("Upload new apk to Alpha", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
					function.waitForElementByXpath(element.getRow(38).getCell(2).getStringCellValue());
					function.clickByXpath(element.getRow(38).getCell(2).getStringCellValue());
					Thread.sleep(3000);
					function.clickByXpath(element.getRow(35).getCell(2).getStringCellValue());
					function.uploadByXpath(element.getRow(36).getCell(2).getStringCellValue(),autoitExePath);
					ATUReports.add("Apk is Uploaded to Alpha", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				}
			}
			catch(Exception e){
				ATUReports.add("Apk was not uploaded. Re-Check the apk file path and run the script again!!", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}

			//Click Store Listing button
			try
			{
				ATUReports.add("Click Store Listing Tab", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				function.waitForElementByXpath(element.getRow(39).getCell(2).getStringCellValue());
				function.clickByXpath(element.getRow(39).getCell(2).getStringCellValue());
				ATUReports.add("Store Listing button is Clicked", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
			catch(Exception e){
				ATUReports.add("Failed to Click on the Store Listing Tab!!", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}

			function.clickByXpath(element.getRow(9).getCell(2).getStringCellValue());
//						break;
//					}
			
			//		case "UPDATE": {

			//			Actions action = new Actions(SelectBrowserToRun.getInstance().getDriver());
			//
			//
			//			//Search for an Application
			//			function.clickByXpath(element.getRow(51).getCell(2).getStringCellValue());
			//			function.sendValueByXpath(element.getRow(51).getCell(2).getStringCellValue(), names[rowIndexCount][param1HeaderCount]);
			//			action.sendKeys(Keys.ENTER).perform();
			//
			//			//Wait for the text "Store Listing"
			//			//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(element.getRow(63).getCell(2).getStringCellValue())));
			//			Thread.sleep(5000);
			//
			//			//Click on the APK tab
			//			function.clickByXpath(element.getRow(53).getCell(2).getStringCellValue());
			//
			//			Thread.sleep(5000);
			//
			//			if(names[rowIndexCount][buildUploadType].toUpperCase().matches("PRODUCTION")){
			//				function.waitForElementByXpath(element.getRow(54).getCell(2).getStringCellValue());
			//				function.clickByXpath(element.getRow(54).getCell(2).getStringCellValue());
			//				function.uploadByXpath(element.getRow(36).getCell(2).getStringCellValue(),element.getRow(36).getCell(3).getStringCellValue());
			//
			//				//What's new in this version?
			//				function.clickByXpath(element.getRow(59).getCell(2).getStringCellValue());
			//				SelectBrowserToRun.getInstance().getDriver().findElement(By.xpath(element.getRow(59).getCell(2).getStringCellValue())).sendKeys(names[rowIndexCount][whatsNewInThisVersionText]);
			//
			//				//Click on Save button
			//				function.clickByXpath(element.getRow(60).getCell(2).getStringCellValue());
			//
			//			}else if(names[rowIndexCount][buildUploadType].toUpperCase().matches("BETA")){
			//
			//				function.clickByXpath(element.getRow(57).getCell(2).getStringCellValue());
			//				function.waitForElementByXpath(element.getRow(55).getCell(2).getStringCellValue());
			//				function.clickByXpath(element.getRow(55).getCell(2).getStringCellValue());
			//				function.uploadByXpath(element.getRow(36).getCell(2).getStringCellValue(),element.getRow(36).getCell(3).getStringCellValue());
			//
			//			}else if(names[rowIndexCount][buildUploadType].toUpperCase().matches("ALPHA")){
			//				function.waitForElementByXpath(element.getRow(58).getCell(2).getStringCellValue());
			//				function.clickByXpath(element.getRow(56).getCell(2).getStringCellValue());
			//				Thread.sleep(3000);
			//				function.clickByXpath(element.getRow(56).getCell(2).getStringCellValue());
			//				function.uploadByXpath(element.getRow(36).getCell(2).getStringCellValue(),element.getRow(36).getCell(3).getStringCellValue());
			//
			//			}
			//
			//			//Click Store Listing button
			//			Thread.sleep(5000);
			//			function.waitForElementByXpath(element.getRow(39).getCell(2).getStringCellValue());
			//			function.clickByXpath(element.getRow(39).getCell(2).getStringCellValue());
//			break;
//			}
			
			//case "STORELISTING" : {

			Actions action = new Actions(SelectBrowserToRun.getInstance().getDriver());

			SelectBrowserToRun.getInstance().getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			function.waitForElementByXpath(element.getRow(10).getCell(2).getStringCellValue());

			//Enter Short description
			ATUReports.add("Enter the Short Description", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			function.clickByXpath(element.getRow(12).getCell(2).getStringCellValue());
			function.clearByXpath(element.getRow(12).getCell(2).getStringCellValue());
			function.sendValueByXpath(element.getRow(12).getCell(2).getStringCellValue(), names[rowIndexCount][shortDescriptionCount]);
			ATUReports.add("Short Description is enetered", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			//Enter full description
			ATUReports.add("Enter the Full Description", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			function.clickByXpath(element.getRow(13).getCell(2).getStringCellValue());
			function.clearByXpath(element.getRow(13).getCell(2).getStringCellValue());
			function.sendValueByXpath(element.getRow(13).getCell(2).getStringCellValue(), names[rowIndexCount][fullDescriptionCount]);
			ATUReports.add("Full Description is enetered", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			//Click on Save Draft button
			//function.clickByXpath(element.getRow(62).getCell(2).getStringCellValue());

			//			break;
			//		}
			//
			//		case "SCREENSHOTS" : {

			// Scroll down 
			ATUReports.add("Scroll Down!!", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			function.scroll(element.getRow(14).getCell(2).getStringCellValue());

			//uploading 7 inch screen shot
			try
			{
				ATUReports.add("Uploading 7 inch screenshots", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				String seveninch[]={"Select","1.0","2.0","3.0","4.0","5.0","6.0","7.0","8.0"};
				String sevenInchCountValue = names[rowIndexCount][sevenInchCount];
				for(int count=0;count<7;count++){
					if(sevenInchCountValue.equals(seveninch[count])){
						sevenInchTotalCount = count;
						break;
					}
				}

				int thirdRow=2;
				if(String.valueOf(sevenInchTotalCount).equals("Select")){
					System.out.println("Seven Inch screen shot not uploaded");

				}else{
					for(int xpathRowCount = 40;sevenInchTotalCount>0;xpathRowCount++){
						int numOfScreens = 1;
						String screenshot = System.getProperty("user.dir")+"\\assets\\"+ autoitscript.getRow(thirdRow).getCell(2).getStringCellValue();
						String executePathForScreenshots = autoitExePath+" "+screenshot;
						Runtime.getRuntime().exec(executePathForScreenshots);

						function.waitForElementByXpath(element.getRow(xpathRowCount).getCell(2).getStringCellValue());
						function.uploadByXpath(element.getRow(xpathRowCount).getCell(2).getStringCellValue(),autoitExePath);
						ATUReports.add("Completed uploading..."+ numOfScreens +" out of "+sevenInchTotalCount +" screenshots", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
						thirdRow++;
						Thread.sleep(2000);
						sevenInchTotalCount--;
						numOfScreens++;
					}
				}
			}
			catch(Exception e){
				ATUReports.add("Uploading 7 inch screenshots failed!!", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}

			//Uploading the Phone screenshots
			try{
				ATUReports.add("Uploading Phone screenshots", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				String phone[]={"Select","1.0","2.0","3.0","4.0","5.0","6.0","7.0","8.0"};
				String phoneCountValue = names[rowIndexCount][PhoneScreenshots];
				for(int count=0;count<7;count++){
					if(phoneCountValue.equals(phone[count])){
						phoneTotalCount = count;
						break;
					}
				}

				int phoneData=10;
				if(String.valueOf(phoneTotalCount).equals("Select")){
					System.out.println("Phone screen shot not uploaded");
				}else{
					for(int xpathRowCount = 64;phoneTotalCount>0;xpathRowCount++){
						int numOfScreens=1;
						String phoneScreenshot = System.getProperty("user.dir")+"\\assets\\"+ autoitscript.getRow(phoneData).getCell(2).getStringCellValue();
						String executePathForPhoneScreenshots = autoitExePath+" "+phoneScreenshot;
						Runtime.getRuntime().exec(executePathForPhoneScreenshots);

						function.waitForElementByXpath(element.getRow(xpathRowCount).getCell(2).getStringCellValue());
						function.uploadByXpath(element.getRow(xpathRowCount).getCell(2).getStringCellValue(),autoitExePath);
						ATUReports.add("Completed uploading..."+ numOfScreens +" out of "+phoneTotalCount +" screenshots", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
						phoneData++;
						numOfScreens++;
						Thread.sleep(2000);
						phoneTotalCount--;
					}
				}
			}
			catch(Exception e){
				ATUReports.add("Uploading Phone screenshots failed!!", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}

			// Scroll down 
			ATUReports.add("Scroll Down", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			action.sendKeys(Keys.PAGE_UP).perform();
			action.sendKeys(Keys.PAGE_UP).release();
			Thread.sleep(2000);
			function.scroll(element.getRow(80).getCell(2).getStringCellValue());

			//Uploading the 10 inch screenshots
			try{
				ATUReports.add("Uploading 10 inch screenshots", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				String teninch[]={"Select","1.0","2.0","3.0","4.0","5.0","6.0","7.0","8.0"};
				String teninchCountValue = names[rowIndexCount][teninchScreenshots];
				for(int count=0;count<7;count++){
					if(teninchCountValue.equals(teninch[count])){
						teninchTotalCount = count;
						break;
					}
				}

				int teninchData=18;
				if(String.valueOf(teninchTotalCount).equals("Select")){
					System.out.println("Phone screen shot not uploaded");
				}else{
					for(int xpathRowCount = 72;teninchTotalCount>0;xpathRowCount++){
						int numOfScreens=1;
						String phoneScreenshot = System.getProperty("user.dir")+"\\assets\\"+ autoitscript.getRow(teninchData).getCell(2).getStringCellValue();
						String executePathForPhoneScreenshots = autoitExePath+" "+phoneScreenshot;
						Runtime.getRuntime().exec(executePathForPhoneScreenshots);

						function.waitForElementByXpath(element.getRow(xpathRowCount).getCell(2).getStringCellValue());
						function.uploadByXpath(element.getRow(xpathRowCount).getCell(2).getStringCellValue(),autoitExePath);
						ATUReports.add("Completed uploading..."+ numOfScreens +" out of "+teninchTotalCount +" screenshots", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
						teninchData++;
						Thread.sleep(2000);
						numOfScreens++;
						teninchTotalCount--;
					}
				}
			}
			catch(Exception e){
				ATUReports.add("Uploading 10 inch screenshots failed!!", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}

			// Scroll down 
			ATUReports.add("Scroll Down", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			action.sendKeys(Keys.PAGE_UP).perform();
			action.sendKeys(Keys.PAGE_UP).release();
			Thread.sleep(2000);
			function.scroll(element.getRow(81).getCell(2).getStringCellValue());

			//uploading Feature Graphics screen shot
			try
			{
				ATUReports.add("Uploading Graphics Image", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				String graphics = System.getProperty("user.dir")+"\\assets\\"+ autoitscript.getRow(26).getCell(2).getStringCellValue();
				String executePathForGraphics = autoitExePath+" "+graphics;

				Runtime.getRuntime().exec(executePathForGraphics);
				function.waitForElementByXpath(element.getRow(19).getCell(2).getStringCellValue());
				function.uploadByXpath(element.getRow(19).getCell(2).getStringCellValue(),autoitExePath);
				ATUReports.add("Successfully uploaded the Graphical image", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
			catch(Exception e){
				ATUReports.add("Failed to Upload Graphics Image", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}

			//uploading App Icon 
			try
			{
				ATUReports.add("Uploading App icon Image", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				String icon = System.getProperty("user.dir")+"\\assets\\"+ autoitscript.getRow(27).getCell(2).getStringCellValue();
				String executePathForIcon = autoitExePath+" "+icon;
				Runtime.getRuntime().exec(executePathForIcon);
				function.waitForElementByXpath(element.getRow(17).getCell(2).getStringCellValue());
				function.uploadByXpath(element.getRow(17).getCell(2).getStringCellValue(),autoitExePath);
				ATUReports.add("Successfully uploaded the App icon image", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
			catch(Exception e){
				ATUReports.add("Failed to Upload App icon image Image", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}

			//			break;
			//		}
			//
			//		case "CATEGORIZATION" : {
			//scroll to categorization field

			ATUReports.add("Scroll Down", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			action.sendKeys(Keys.PAGE_DOWN).perform();
			function.waitForElementByXpath("//select[contains(.,'Select an application type')]");


			try{
				ATUReports.add("Select the Application Type", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				Select application_type = new
				Select(SelectBrowserToRun.getInstance().getDriver().findElement(By.xpath("//select[contains(.,'Select an application type')]")));

				function.clickByXpath("//select[contains(.,'Select an application type')]");
				application_type.selectByVisibleText(names[rowIndexCount][applicationType]);			 
				action.sendKeys(Keys.ENTER).perform();
				ATUReports.add("The Application Type is selected", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				Thread.sleep(3000);

			}
			catch(Exception e)
			{
				ATUReports.add("Fail to select the Application type", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}

			//Selecting Category
			ATUReports.add("Select the Category", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			function.selectByXPath(element.getRow(22).getCell(2).getStringCellValue(), names[rowIndexCount][category]);

			//Selecting content rating
			ATUReports.add("Select the Content Rating", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			function.selectByXPath(element.getRow(23).getCell(2).getStringCellValue(), names[rowIndexCount][contentRating]);

			//Entering privacy policy
			ATUReports.add("Enter the Privacy Policy if available", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			if((names[rowIndexCount][privacyPolicy]).startsWith("http")){
				function.clearByXpath(element.getRow(24).getCell(2).getStringCellValue());
				function.sendValueByXpath(element.getRow(24).getCell(2).getStringCellValue(), names[rowIndexCount][privacyPolicy]);	 
			}else{
				ATUReports.add("Privacy Policy is not Submitted", LogAs.WARNING, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				function.clickByXpath(element.getRow(25).getCell(2).getStringCellValue());
			}

			//Save
			try{
			ATUReports.add("Click on Save button", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			action.sendKeys(Keys.HOME).perform();
			function.clickByXpath(element.getRow(26).getCell(2).getStringCellValue());
			Thread.sleep(20000);
			}
			catch(Exception e){
				ATUReports.add("Google Console has not saved the contents. Re-Check again!!", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			}
			//			break;
			//		}
			//
			//		case "PRICING" : {
			//Actions action = new Actions(SelectBrowserToRun.getInstance().getDriver());
			try{
			ATUReports.add("Click on Pricing and Distribution Tab", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));

			SelectBrowserToRun.getInstance().getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			function.clickByXpath(element.getRow(27).getCell(2).getStringCellValue());

			//Wait till page gets loaded
			function.waitForElementByXpath(element.getRow(28).getCell(2).getStringCellValue());
			ATUReports.add("Pricing and Distribution page opened", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
			catch(Exception e){
				ATUReports.add("Fail to open the Pricing and Distribution page. Recheck!!", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}

			String countryname = names[rowIndexCount][countriesToPublish];

			ATUReports.add("Selecting the Countries to Publish", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			
			try{
			if(countryname.toUpperCase().matches("ALL")){
				
				function.clickByXpath(element.getRow(29).getCell(2).getStringCellValue());
				ATUReports.add("Selected All Countries", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}else{
				ATUReports.add("User has selected to Publish this App in few countries", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				String countryFileName = "StoreListing.xls";
				String countrySheetName = "Countries";

				Sheet countrySheet = readExcelValues.readExcel(readExcelValues.FilePath, countryFileName, countrySheetName);

				for (int countryName = 1; countryName < rowCount+1; countryName++) {
					//Loop over all the rows
					Row row = countrySheet.getRow(countryName);

					if(row.getCell(0).toString().length()!=0){
						String status = row.getCell(2).toString().toUpperCase();

						if(status.matches("T")){
							ATUReports.add("The User selected countries are: "+ row.getCell(1).toString()+"----"+row.getCell(2).toString(), LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
							country.selectcountry(row.getCell(0).toString(),row.getCell(1).toString(),row.getCell(2).toString());
						}

					}

				}

			}
			}
			catch(Exception e){
				ATUReports.add("Selecting the Countries to Publish Failed!! ", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}

			//Check Marketing Content Guidelines
			ATUReports.add("Check the Marketing Content Guidelines", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			function.clickByXpath(element.getRow(30).getCell(2).getStringCellValue());
			//Check Marking US Export Laws
			ATUReports.add("Check the Marking US Export Laws", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			function.clickByXpath(element.getRow(31).getCell(2).getStringCellValue());

			//Save
			try{
			ATUReports.add("Click on Save button", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			action.sendKeys(Keys.HOME).perform();
			function.clickByXpath(element.getRow(26).getCell(2).getStringCellValue());
			ATUReports.add("Clicked on Save button", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			Thread.sleep(20000);
			}
			catch(Exception e){
				ATUReports.add("Fail to Click on Save button", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}

			break;

		}

		default: break;
		}
	}
}
