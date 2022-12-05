package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.beust.jcommander.JCommander.Builder;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class AdministratorCertification extends SalesForcePreConditions{
		
	/*
	 * Testcase 2. Administrator Certifications
==============================
1. Launch Salesforce application
2. Login with username and password
3. Click on Learn More link in Mobile Publisher
4. Click confirm on Confirm redirect
5. Mouse hover on Learning On Trailhead
6. Clilck on Salesforce Certifications
6. Click on Ceritification Administrator
7. Navigate to Certification - Administrator Overview window--Check the url(verify url)
8. Verify the Certifications available for Administrator Certifications should be displayed
	 */
@Test
	public  void runAdministratorCertification() throws IOException {
	driver.findElement(By.xpath("//img[@alt='Salesforce<br/>Administrator']")).click();
	
	List<WebElement> admincertificates = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
	for (int i = 0; i < admincertificates.size(); i++) {
		System.out.println(admincertificates.get(i).getText());
	}
	
		WebElement scrltoadmincert = driver.findElement(By.xpath("//a[text()='Marketing Cloud Administrator']"));
	    Actions builder=new Actions(driver);
	    builder.scrollToElement(scrltoadmincert).perform();
	    
	    File source = driver.getScreenshotAs(OutputType.FILE);
	    File dest=new File("./admincredsnap2.jpg");
	    FileUtils.copyFile(source, dest);
	
		
	}

}
