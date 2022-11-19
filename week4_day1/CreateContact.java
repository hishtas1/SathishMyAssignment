package week4.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("SATHISH");
		driver.findElement(By.id("lastNameField")).sendKeys("sathish");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("sathish");
		driver.findElement(By.id("createContactForm_description")).sendKeys("sathish");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sathish@ssew.com");
		driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("0123456789");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
