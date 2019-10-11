package fileHandling;

import java.io.IOException;

public class TestXlsReaderClass {

	public static void main(String[] args) throws IOException {

		Xls_Reader xl=new Xls_Reader("E:\\AutomationRepo_09192019\\BasicJavaProject\\src\\fileHandling\\TestData.xls");
		
		//Get Row COunt
		System.out.println(xl.getrowcount("Sheet1"));
		
		//Get COlumn count
		System.out.println(xl.getColumncount("Sheet1"));
		
		//get cell data
		System.out.println(xl.getCellData("Sheet1", 1, 2));
		
	}

}
