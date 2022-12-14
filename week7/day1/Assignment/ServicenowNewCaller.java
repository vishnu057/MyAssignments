package week7.day1.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class ServicenowNewCaller extends PsmServicenow {
	
	@BeforeTest
	public void openDB() {
	snexcel= "newcaller";
	}
	
	@Test(dataProvider="servicenow")

	public  void runNewCaller(String fname, String lname, String title, String mail, String bno,String mno) throws InterruptedException {
		
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
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys(lname);
		driver.findElement(By.xpath("//input[@aria-label='Title']")).sendKeys(title);
		driver.findElement(By.xpath("//input[@aria-label='Email']")).sendKeys(mail);
		driver.findElement(By.xpath("//input[@aria-label='Business phone']")).sendKeys(bno);
		driver.findElement(By.xpath("//input[@aria-label='Mobile phone']")).sendKeys(mno);
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
