package sample_project;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Interfacefont {

	public static void main(String[] args)throws Throwable {

		FileInputStream fi= new FileInputStream("D:/Sample.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet ws =wb.getSheet("Emp");
		int rc = ws.getLastRowNum();
		System.out.println(rc);
		for (int i=1;i<=rc;i++)
		{
		//	ws.getRow(i).getCell(4).setCellValue("pass");
			ws.getRow(i).getCell(4).setCellValue("fail");
		//	ws.getRow(i).getCell(4).setCellValue("blocked");
			CellStyle style = wb.createCellStyle();
			Font font = wb.createFont();
		//	font.setColor(IndexedColors.GREEN.getIndex());
			font.setColor(IndexedColors.RED.getIndex());
		//	font.setColor(IndexedColors.BLACK.getIndex());
			font.setBold(true);
			style.setFont(font);
			ws.getRow(i).getCell(4).setCellStyle(style);
			
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("D:/Results.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
	}

}
