package utils;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	public static String[][] readData(String excelfilename) throws IOException {
		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+excelfilename+".xlsx");
		XSSFSheet wsheet = wbook.getSheetAt(0);
		int rowcount = wsheet.getLastRowNum();
		System.out.println("Excel total row count:" +rowcount);
		int columncount = wsheet.getRow(0).getLastCellNum();
		System.out.println("Total column count: "+columncount);
		String[][] data = new String[rowcount][columncount];
		for (int i = 1; i <= rowcount; i++) {
			XSSFRow row = wsheet.getRow(i);	
			for (int j = 0; j < columncount; j++) {
				String stringcelldata = row.getCell(j).getStringCellValue();
				System.out.println(stringcelldata);
				data[i-1][j]=stringcelldata;
				
			}
		}
		wbook.close();
		return data;
	}
}
