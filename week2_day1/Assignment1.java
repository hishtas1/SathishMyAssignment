package week2.day1.assignment;
//Assignment 1
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ssew");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SATHISH");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("sathish");
		driver.findElement(By.id("createLeadForm_dataSourceId")).click();
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sathish");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("sathish");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("sathish");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sathish@ssew.com");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
	}

}
