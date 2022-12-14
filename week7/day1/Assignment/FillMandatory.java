package week7.day1.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class FillMandatory extends PsmServicenow {
	
	@BeforeTest
	public void openDB() {
		snexcel="fillmandatory";

	}
	@Test(dataProvider="servicenow")

	public  void runFillMandatory(String input1, String input2) throws InterruptedException {
	
	
	Shadow shadow=new Shadow(driver);
	shadow.setImplicitWait(30);
	shadow.findElementByXPath("//div[text()='All']").click();
	shadow.setImplicitWait(5);
	shadow.findElementByXPath("//input[@id='filter']").sendKeys(input1);
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
	driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys(input2);
	driver.findElement(By.xpath("//button[text()='Submit']")).click();

}
}
