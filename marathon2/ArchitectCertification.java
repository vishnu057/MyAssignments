package marathon2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

/*
 * Testcase:1

Architect Certifications
==========================
1. Launch Salesforce application https://login.salesforce.com/
2. Login with Provided Credentials
3. Click on Learn More link in Mobile Publisher  and click Confirm
4. Click Learning and Mouse hover on Learning On Trailhead
5. Select SalesForce Certification 
6. Choose Your Role as Salesforce Architect and verify the URL
7. Get the Text(Summary) of Salesforce Architect 
8. Get the List of Salesforce Architect Certifications Available
9. Click on Application Architect 
10.Get the List of Certifications available
Credentials:
hari.radhakrishnan@qeagle.com
Testleaf$321
 */

public class ArchitectCertification extends SalesForcePreConditions {
@Test
	public  void runArchitectCertification() throws InterruptedException {
		
		driver.findElement(By.xpath("//img[@alt='Salesforce<br/>Architect']")).click();
		Thread.sleep(3000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current page url:"+currentUrl);
		WebElement SFARCHITECT = driver.findElement(By.xpath("//div[@class='cert-site_text slds-text-align--center Lh(1.5) Fz(16px) slds-container--center slds-p-bottom--large']"));
		System.out.println("SALES FORCE ARCHITECT:"+SFARCHITECT.getText());
		
		List<WebElement> SFArchList = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		for(WebElement SFlist : SFArchList  ) {
			
			String SFlist1 = SFlist.getText();
			System.out.println("SF ARCHITECT:"+SFlist1);
		}
		
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
		
		List<WebElement> APPARCH = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		for(WebElement AplicationArchitectList : APPARCH) {
			
			String ListOFAPPARCHITECT = AplicationArchitectList.getText();
			System.out.println("Application Architect:"+ListOFAPPARCHITECT);
			
		}
		
		//need to learn how to print as array {cuhnk,idbib,}

	}

}
