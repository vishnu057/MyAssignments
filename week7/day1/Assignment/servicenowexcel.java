package week7.day1.Assignment;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class servicenowexcel {

	public static String[][] runExcelSN(String filename) throws IOException {
     
		XSSFWorkbook wkbook=new XSSFWorkbook("Data/"+filename+".xlsx");
		XSSFSheet sheet = wkbook.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		short colomncount = sheet.getRow(0).getLastCellNum();
		
		String [][] data=new String[rowcount][colomncount];
		
		for (int i = 1; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < colomncount; j++) {
			XSSFCell cell = row.getCell(j);
			
			data[i-1][j]= cell.getStringCellValue();
			
			System.out.println(cell.getStringCellValue());
			
			}			
		}
		
		wkbook.close();
		return data;

	}

	}


