package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vishnu");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Prasad");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("tylerdurden@hotmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("tyler123");
		//select day
		WebElement selectday = driver.findElement(By.xpath("//*[@id=\'day\']"));
		Select drop=new Select(selectday);
		drop.selectByValue("25");
		//select month
		WebElement selectmonth = driver.findElement(By.xpath("//select[@id='month']"));
		Select drop1=new Select(selectmonth);
		drop1.selectByVisibleText("Aug");
		//select year
		WebElement selectyear = driver.findElement(By.xpath("//select[@id='year']"));
		Select drop2=new Select(selectyear);
		drop2.selectByValue("1994");
		//select Gender
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		//close browser
		driver.close();
		
	
		
		

	}

}
