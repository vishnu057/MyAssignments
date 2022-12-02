package week5.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead2 extends ProjectSpecificMethod {

	@Test(dataProvider="Lead data")
	

	public  void runCreateLead(String cname,String fname,String lname,String phone) {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phone);
		driver.findElement(By.name("submitButton")).click();
		
}
	
	@DataProvider(name= "Lead data")
	public String[][] getData() {       //r//c 
		String [][] data=new String [3][4];
		//1st set
		data[0][0]="TATA";
		data[0][1]="Mohammed";
		data[0][2]="Anas";
		data[0][3]="998999";
		//2nd set
		data[1][0]="Maersk";
		data[1][1]="Gokul";
		data[1][2]="Suresh";
		data[1][3]="995699";
		//3rd set
		data[2][0]="Heidenhain";
		data[2][1]="Bibin";
		data[2][2]="Raj";
		data[2][3]="9912699";
		
		return data;
		

	}
	
		
		
		
		
	
}






