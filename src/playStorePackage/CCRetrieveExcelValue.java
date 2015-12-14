package playStorePackage;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.Test;

public class CCRetrieveExcelValue {
	static Operation opt = new Operation();
	public static void retrieveExcelCellValues(Sheet excelSheet,String Name,String sheetString,String switchcase) throws Exception
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
	
	public static int retrieveNoOfRows(Sheet excelSheet,String Name) {
		int rowCount = excelSheet.getLastRowNum()-excelSheet.getFirstRowNum();
		return rowCount;
	}


	public static int retrieveNoOfColumns(Sheet excelSheet,String Name){
		int colCount = excelSheet.getRow(0).getPhysicalNumberOfCells();
		return colCount;
	}
	
}
