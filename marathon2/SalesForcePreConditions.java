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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class SalesForcePreConditions {
	public ChromeDriver driver;
@BeforeMethod
	public void launchSF() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeOptions ch=new ChromeOptions();
	ch.addArguments("--disable-notifications");
	driver=new ChromeDriver(ch);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://login.salesforce.com/");
	driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).sendKeys("Testleaf$321");
	driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
	
	driver.findElement(By.xpath("//span[@data-aura-rendered-by='2321:0']")).click();
	Set<String> sfwin = driver.getWindowHandles();
	List<String> winlist=new ArrayList<String>(sfwin);
	driver.switchTo().window(winlist.get(1));
	driver.findElement(By.xpath("//button[@onclick='goAhead()']")).click();
	Shadow shadow=new Shadow(driver);
	shadow.findElementByXPath("//span[text()='Learning']").click();
	Thread.sleep(3000);
	WebElement mhonlearning = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
	Actions mh=new Actions(driver);
	mh.moveToElement(mhonlearning).perform();
	shadow.findElementByXPath("//a[text()='Salesforce Certification']").click();

	}

@AfterMethod

public void tearDown() {
	driver.close();

}
	

}
