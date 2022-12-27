package week5.day2.LeafGround;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropdown{
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.xpath("(//label[contains(@class,'ui-selectonemenu-label')])[1]")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		
		
		driver.findElement(By.xpath("(//label[contains(@class,'ui-selectonemenu-label ui-inputfield')])[2]")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
		
		WebElement findElement = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		findElement.sendKeys("AWS");
		driver.findElement(By.xpath("//span[text()='AWS']")).click();
		findElement.sendKeys("Appium");
		driver.findElement(By.xpath("//span[text()='Appium']")).click();
		
		
		WebElement selectTool = driver.findElement(By.className("ui-selectonemenu")); 
		Select select = new Select(selectTool);
		select.selectByVisibleText("Selenium"); 
		
		
		driver.findElement(By.xpath("(//label[contains(@class,'ui-selectonemenu-label')])[3]")).sendKeys("AWS");
		driver.findElement(By.xpath("//li[text()='Tamil']")).click();
		
		
		
		
	}
}
