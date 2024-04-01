package sample_project;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Alternate_method {

	public static void main(String[] args)throws Throwable {
		//read path of excel
		FileInputStream fi = new FileInputStream("D:/Sample.xlsx");
        //get wb
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws = wb.getSheet("Emp");
		//count no of rows in sheet
		int rc = ws.getLastRowNum();
		System.out.println("no of rows are ::"+rc);
		//print any row first cell data
		String fname = ws.getRow(6).getCell(0).getStringCellValue();
		//print any row second cell data 
		String mname = ws.getRow(5).getCell(1).getStringCellValue();
		//print any row third cell data
		String lname = ws.getRow(4).getCell(2).getStringCellValue();
		//print any row fourth cell data
		int eid = (int)ws.getRow(8).getCell(3).getNumericCellValue();
		System.out.println(fname+"  "+mname+"  "+lname+"  "+eid);
		fi.close();
		wb.close();
	}

}
