package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3Createcontacts {

	public static void main(String[] args) {
		/*
		 * Assignment:3
		 * 
		 * Open the browser,Load the URL, Maximize the browser, Enter UserName, Enter
		 * Password, Click Login, Click CRM/SFA, Click Contacts Tab, Click Create Contact,
		 * Type First Name, Type Last Name, Click Create Contact Button, Print the first
		 * name and browser title, Close the browser
		 * 
		 */

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Tyler");
		driver.findElement(By.id("lastNameField")).sendKeys("Durden");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
