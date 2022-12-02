package week5.day2.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class FillMandatoryFIelds extends PreconditionServicenow {
	
	/*
	 * Assignment 4:Fill mandatory fields "
	 * 1. Launch ServiceNow application 
	 * 2. Login with valid credentials 
	 * 3. Enter Knowledge in filter navigator and press enter
	 * 4. Create new Article 
	 * 5.Select knowledge base as IT and category as IT- java and Click Ok 
	 * 6.Update the other mandatory fields 7.Select the submit option "
	 */
    @Test
	public  void runFillMandatoryFIelds() throws InterruptedException {
    	
    	Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(30);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.setImplicitWait(5);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("knowledge");
		shadow.findElementByXPath("//a[@aria-label='Knowledge']").click();
		WebElement newarticle = shadow.findElementByXPath("//iframe[@name='gsft_main']");
		driver.switchTo().frame(newarticle);
		driver.findElement(By.xpath("//span[text()='Create an Article']")).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		WebElement newarticle2 = shadow.findElementByXPath("//iframe[@name='gsft_main']");
		driver.switchTo().frame(newarticle2);
		driver.findElement(By.xpath("//button[@aria-label='Look up value for field: Knowledge base']")).click();
		Set<String> wh = driver.getWindowHandles();
		List<String> winhan=new ArrayList<String>(wh);
		driver.switchTo().window(winhan.get(1));
		driver.findElement(By.xpath("(//a[@class='glide_ref_item_link'])[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().window(winhan.get(0));
		Thread.sleep(3000);
		WebElement cat = shadow.findElementByXPath("//iframe[@name='gsft_main']");
		driver.switchTo().frame(cat);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='lookup.kb_knowledge.kb_category']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@aria-label='IT,level1 choose a category and click right arrow to navigate to its respective level2']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@aria-label='Java,level2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='ok_button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys("knowledge record");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();


	}

}
