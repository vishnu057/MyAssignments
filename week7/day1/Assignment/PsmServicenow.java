package week7.day1.Assignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PsmServicenow {
	
    String snexcel;
	
	public ChromeDriver driver;
	
	@BeforeMethod
	
	public  void LaunchChrome() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev94099.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Testleaf@2022");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
	
	@DataProvider(name="servicenow")
	public String[][] runexcel() throws IOException {
		String[][] runExcelSN = servicenowexcel.runExcelSN(snexcel);
		return runExcelSN;
		
		

	}
	
	
	

}
