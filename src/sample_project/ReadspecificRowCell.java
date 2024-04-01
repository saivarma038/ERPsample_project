package sample_project;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadspecificRowCell {

	public static void main(String[] args)throws Throwable {
		
		// read path of excel
		FileInputStream fi =new FileInputStream("D:/Sample.xlsx");
		//get wb from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws = wb.getSheet("Emp"); 
		//get fifth row from row
		XSSFRow row = ws.getRow(5);
		//count no of rows in sheet
		int rc = ws.getLastRowNum();
		System.out.println("no of rows are ::"+rc );
		//get each cell from row
		XSSFCell c1 = row.getCell(0);
		XSSFCell c2 = row .getCell(1);
		XSSFCell c3 = row.getCell(2);
		XSSFCell c4 = row.getCell(3);
		//read each cell data
		String fname = c1.getStringCellValue();
		String mname = c2.getStringCellValue();
		String lname = c3 .getStringCellValue();
		int eid = (int) c4.getNumericCellValue();
		System.out.println(fname+"  "+mname+"  "+lname+" "+eid);
		fi.close();
		wb.close();
		
		

	}

}
