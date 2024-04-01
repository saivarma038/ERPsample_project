package sample_project;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Usinginerface {

	
		public static void main(String[] args)throws Throwable {
			FileInputStream fi = new FileInputStream("D:/Sample.xlsx");
			Workbook wb = WorkbookFactory.create(fi);
			Sheet ws = wb.getSheet("Emp");
			int rc = ws.getLastRowNum();
			for(int i=1;i<=rc;i++)
			{
				String fname = ws.getRow(i).getCell(0).getStringCellValue();
				String mname = ws.getRow(i).getCell(1).getStringCellValue();
				String lname = ws.getRow(i).getCell(2).getStringCellValue();
				int eid = (int) ws.getRow(i).getCell(3).getNumericCellValue();
				System.out.println(fname+"  "+mname+"  "+lname+"  "+eid);
				ws.getRow(i).createCell(4).setCellValue("i want job with 25L package");
			}
			fi.close();
			FileOutputStream fo = new FileOutputStream("D:/Results.xlsx");
			wb.write(fo);
			fo.close();
			wb.close();
	}

}
