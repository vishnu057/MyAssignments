package week5.day2.assignment;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

/*Asssignment 2:Create new Proposal
"1. Launch ServiceNow application
2. Login with valid credential 
3. Click All and Enter Proposal in filter navigator and press enter 
4. Click- new  and  fill mandatory fields and click 'Submit' 
Button.
5. Verify the successful creation of new Proposal"
*/

public class CreateNewProposal extends PreconditionServicenow {
@Test
	public  void runCreateNewProposal() throws InterruptedException {
	
	Shadow shadow=new Shadow(driver);
	shadow.setImplicitWait(30);
	shadow.findElementByXPath("//div[text()='All']").click();
	shadow.setImplicitWait(5);
	shadow.findElementByXPath("//input[@id='filter']").sendKeys("proposal");
    shadow.findElementByXPath("//a[@aria-label='My Proposals']").click();
    WebElement frame1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
    driver.switchTo().frame(frame1);
   
	driver.findElement(By.id("sysverb_new")).click();
	
	String windows = driver.getWindowHandle();
	driver.findElement(By.xpath("(//span[@class='icon icon-search'])[2]")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println("no of win:" + windowHandles.size());
	List<String> windowlist=new ArrayList<String>(windowHandles);
	System.out.println(driver.getWindowHandle());
	driver.switchTo().window(windowlist.get(1));
	System.out.println(driver.getWindowHandle());
	driver.findElement(By.xpath("//a[text()='Standard Changes']")).click();
	Thread.sleep(3000);
	driver.switchTo().window(windowlist.get(0));
	System.out.println(driver.getWindowHandle());
	WebElement frame2 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
    driver.switchTo().frame(frame2);
	Thread.sleep(3000);
	driver.findElement(By.id("std_change_proposal.short_description")).sendKeys("Learn Selenium");
    Thread.sleep(3000);
	driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
	WebElement verifyproposal = driver.findElement(By.xpath("//td[text()='Learn Selenium']"));
	if(verifyproposal.getText().contains("Learn Selenium")) {
		
		System.out.println("Proposal created");
	}
	}

}
