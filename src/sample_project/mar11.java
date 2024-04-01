package sample_project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class mar11 {

	public static void main(String[] args) throws Throwable
	{
		// read path of excelfile 
		FileInputStream fi = new FileInputStream("D:/sample.xlsx");
		//get wb from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from n r
		XSSFSheet ws = wb.getSheet("EMP");
		//get first row from EMP sheet
		XSSFRow row = ws.getRow(0);
		//count no of cells in first row
		int cc = row.getLastCellNum();
		//count no of rows in EMP sheet
		int rc = ws.getLastRowNum();
		System.out.println("no of rows in sheet ::"+rc+" "+"no of cell in first row ::"+cc);
		fi.close();
		wb.close();
		

	
		
		

	}

}
