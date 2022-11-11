package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		//select by index
		WebElement index = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select drp1=new Select(index);
		drp1.selectByIndex(1);
		//select by text
		WebElement bytext = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select drp2=new Select(bytext);
		drp2.selectByVisibleText("Loadrunner");
		
	//select by value
		WebElement byvalue = driver.findElement(By.xpath("//select[@name='dropdown3']"));
		Select drp3=new Select(byvalue);
		drp3.selectByValue("3");	
		//select by send keys
		driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("Appium");
		//select programs
		driver.findElement(By.xpath("(//div[@class='example']//option)[29]")).click();
		

	}

}
