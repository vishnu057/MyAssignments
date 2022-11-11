package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		System.out.println(driver.findElement(By.xpath("//button[@id='position']")).getLocation());
		System.out.println(driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.xpath("//button[@id='size']")).getSize());
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='home']")).click();
		
		
		

	}

}
