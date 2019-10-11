package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file=new FileInputStream("E:\\AutomationRepo_09192019\\BasicJavaProject\\src\\fileHandling\\TestData.xls");
		
		HSSFWorkbook wb=new HSSFWorkbook(file);
		
		HSSFSheet Sheet=wb.getSheet("Sheet1");
		
		HSSFRow row=Sheet.getRow(0);
		
		HSSFCell cell=row.getCell(0);
		
		System.out.println(cell.getStringCellValue());
		
		//Number of Rows
		System.out.println(Sheet.getLastRowNum());
		
		//Column number
		System.out.println(row.getLastCellNum());
		
	}

}
