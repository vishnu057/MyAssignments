package week7.day1.Assignment;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends DataProviderClass {
	
	@BeforeTest
	public void openDB() {
		getexcel= "createleadLT";

	}
	
	@Test(dataProvider="pulldata")

	public  void runcreateLead(String username, String password, String cname, String fname, String lname, String pno ) {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps");
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pno);
        driver.findElement(By.name("submitButton")).click();
        driver.close();

	}
	
	/*
	 * @DataProvider(name="pulldata")
	 * 
	 * public String [][] getData() throws IOException {
	 * 
	 * String[][] readxldata = ReadExcelCreateLead.readxldata(excel);
	 * 
	 * return readxldata;
	 * 
	 * 
	 * }
	 */

}
