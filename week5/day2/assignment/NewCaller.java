package week5.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class NewCaller extends PreconditionServicenow {
	
	/*
	 * Assignment 3:Create New Caller
	 *  "1. Launch ServiceNow application 
	 *  2. Login with valid credential 
	 *  3. Click-All and Enter Callers in filter navigator and press enter 
	 * 4. Create new Caller by filling all the fields and click 'Submit'. 
	 * 5. Search and verify the newly created Caller"
	 */
	@Test
	public  void runNewCaller() throws InterruptedException {
		Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(30);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.setImplicitWait(5);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("callers");
		shadow.findElementByXPath("//mark[text()='Callers']").click();
		WebElement framecaller = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(framecaller);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		//driver.findElement(By.id("sysverb_new")).click();															
		WebElement framecaller2 = shadow.findElementByXPath("//iframe[@name='gsft_main']");
		driver.switchTo().frame(framecaller2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Dhaneesh");
		driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("mv");
		driver.findElement(By.xpath("//input[@aria-label='Title']")).sendKeys("Mr.");
		driver.findElement(By.xpath("//input[@aria-label='Email']")).sendKeys("dhaneesh@hotmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Business phone']")).sendKeys("+91 9876543210");
		driver.findElement(By.xpath("//input[@aria-label='Mobile phone']")).sendKeys("+91 9876543210");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		WebElement verifycontact = driver.findElement(By.xpath("//td[text()='Dhaneesh']"));
		if(verifycontact.getText().contains("Dhaneesh")) {
			System.out.println("contact verified");
		}
		else {
			System.out.println("contact unverified");
		}
		
	}

}
