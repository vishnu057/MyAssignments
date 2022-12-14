package week7.day1.Assignment;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelCreateLead {

	public static String[][] readxldata(String filename) throws IOException {
   XSSFWorkbook xlbook=new XSSFWorkbook("Data/"+filename+".xlsx");
   XSSFSheet xlsheet = xlbook.getSheetAt(0);
   int xlrc = xlsheet.getLastRowNum();
   System.out.println(xlrc);
   short xlcc = xlsheet.getRow(0).getLastCellNum();
   System.out.println(xlcc);
   
   String [][] data=new String[xlrc][xlcc];
   for (int i = 1; i <= xlrc; i++) {
	   XSSFRow row = xlsheet.getRow(i);
	   
	   for (int j = 0; j < xlcc; j++) {
		   XSSFCell cell = row.getCell(j);
		   
		   data[i-1][j]=cell.getStringCellValue();
		   System.out.println(cell.getStringCellValue());
		
	}
	
}
 
 xlbook.close();
 return data;

	}

}
