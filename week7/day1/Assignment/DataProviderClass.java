package week7.day1.Assignment;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	String getexcel;
	
	@DataProvider(name="pulldata")
	
	public String[][] gatData() throws IOException {
		String[][] readxldata=ReadExcelCreateLead.readxldata(getexcel);
		return readxldata;
		
		

	}
	

}
