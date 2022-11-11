package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWIthEditFields {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vish@hotmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(" text");
		System.out.println(driver.findElement(By.xpath("( //input[@name='username'])[1]")).getAttribute("value"));
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		System.out.println(driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled());
			
		
		
	}

}
