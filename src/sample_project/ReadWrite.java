package sample_project;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite {

	public static void main(String[] args)throws Throwable {
		// read path of excel
	FileInputStream fi = new FileInputStream("D:/Sample.xlsx");
	// get wb from file
    XSSFWorkbook wb = new XSSFWorkbook(fi);
    //get sheet from wb
    XSSFSheet ws = wb.getSheet("Emp");
    //count no of rows in Emp sheet
    int rc =ws.getLastRowNum();
    System.out.println("no of rows are ::"+rc);
    //iterate all rows
    for(int i=1;i<=rc;i++)
    {
    	//read all rows cell data
    	String fname =ws.getRow(i).getCell(0).getStringCellValue();
    	String mname =ws.getRow(i).getCell(1).getStringCellValue();
    	String lname =ws.getRow(i).getCell(2).getStringCellValue();
    	int eid =(int) ws.getRow(i).getCell(3).getNumericCellValue();
    	System.out.println(fname+"  "+mname+"  "+lname+"  "+eid);
    	//write some text into cell data
    	ws.getRow(i).createCell(4).setCellValue("pass");
    }
	fi.close();
	FileOutputStream fo = new FileOutputStream("D:/Result.xlsx");
	wb.write(fo);
	fo.close();
	wb.close();
	}

}