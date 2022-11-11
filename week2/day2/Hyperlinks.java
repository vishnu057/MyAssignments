package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		System.out.println(driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).getAttribute("href"));
        System.out.println(driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).isDisplayed());
        
	}

}
