package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathEditLead {

	public static void main(String[] args) {
		/*http://leaftaps.com/opentaps/control/main
		
		* 1	Launch the browser
		* 2	Enter the username
		* 3	Enter the password
		* 4	Click Login
		* 5	Click crm/sfa link
		* 6	Click Leads link
		* 7	Click Find leads
		* 8	Enter first name
		* 9	Click Find leads button
		* 10 Click on first resulting lead
		* 11 Verify title of the page
		* 12 Click Edit
		* 13 Change the company name
		* 14 Click Update
		* 15 Confirm the changed name appears
		* 16 Close the browser (Do not log out)
*/
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("sherlock");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//a[text()='12305']")).click();
		
		String text1 = driver.findElement(By.xpath("//span[text()='sherlock']")).getText();
		if(text1.contains("sherlock")) {
			System.out.println("lead name is visible");
		}
		else {
			
			System.out.println("not visible");
		}
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("(//td[@class='label']/following::input)[1]")).clear();
		driver.findElement(By.xpath("(//td[@class='label']/following::input)[1]")).sendKeys("detective services");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
	
		String text2 = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		if(text2.contains("detective services")) {
			
			System.out.println("update successful");
			
		}
		else{
			
			System.out.println("update not saved");
		}
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
