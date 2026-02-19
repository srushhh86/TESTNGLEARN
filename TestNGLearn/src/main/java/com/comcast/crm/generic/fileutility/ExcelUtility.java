package com.comcast.crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getDataFromExcel(String sheetname,int rownum,int celnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("/Users/srushtimarihal/Downloads/VtigerTestcaseUpdated.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(rownum).getCell(celnum).getStringCellValue();
		wb.close();// bez excelsheet object is opened and after so many times it might get crashed
		return data;
	}
	
	public int getRowCount(String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./testdata/VtigerTestcase_updated.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount=wb.getSheet(sheetname).getLastRowNum();
		wb.close();
		return rowcount;

		
	}
	
	
	public void setDataIntoExcel(String sheetname,int rownum,int celnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./testdata/testScriptdata_updated.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(rownum).createCell(celnum);
		
		FileOutputStream fos=new FileOutputStream("./testdata/testScriptdata.xlsx");
		wb.write(fos);
		wb.close();
		

	}

}
