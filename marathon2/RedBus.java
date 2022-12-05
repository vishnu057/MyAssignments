package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Red Bus:
=====
01) Launch Firefox / Chrome
02) Load https://www.redbus.in/
03) Type ""Chennai"" in the FROM text box and select the first option
04) Type ""Bangalore"" in the To text box and select the first option
05) Select tomorrow's date in the Date field
06) Click Search Buses
07) Print the number of buses shown as results
08) Choose SLEEPER in the left menu 
09) Print the name of the second resulting bus 
10) Click the VIEW SEATS of that bus
11) Take screenshot and close browser
 */

public class RedBus {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable -notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		//get redbus
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@select-id='results[0].BpList[0]']")).click();
		driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@select-id='results[0].BpList[0]']")).click();
		driver.findElement(By.xpath("//td[@class='current day']")).click();
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		WebElement noofbus = driver.findElement(By.xpath("//span[@class='f-bold busFound']"));
		System.out.println("No of BUS:"+noofbus.getText());
		driver.findElement(By.xpath("(//label[@for='bt_SLEEPER'])[1]")).click();
		System.out.println("No of sleeper BUS: "+noofbus.getText());
		List<WebElement> listofbusses = driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));
		System.out.println("2nd bus in the List: "+listofbusses.get(1).getText() );
		driver.findElement(By.xpath("(//div[@class='button view-seats fr'])[2]")).click();
		WebElement viewseat = driver.findElement(By.xpath("//div[@class='leftContent clearfix m-top-10 seatlayout-padding-10']"));
		Actions action=new Actions(driver);
		action.scrollToElement(viewseat).perform();
		Thread.sleep(3000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File Dest=new File("./snap/viewseat.jpg");
		FileUtils.copyFile(source, Dest);
		
		driver.close();
				
	}

}
