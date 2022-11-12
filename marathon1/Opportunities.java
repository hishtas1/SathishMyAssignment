package week2.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opportunities {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		WebElement click1 = driver.findElement(By.xpath("//p[text()='Sales']"));
		driver.executeScript("arguments[0].click();",click1);
		WebElement click2 = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();",click2);
		driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
		driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("SATHISH");
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("10/11/2022");
		driver.findElement(By.xpath("(//button[@data-value='--None--'])[1]")).click();
		driver.findElement(By.xpath("//span[@title='Qualification']")).click();
		//driver.findElement(By.xpath("//span[text()='Perception Analysis']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("SATHISH");
		driver.findElement(By.xpath("//strong[text()='SATHISH']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String attribute = driver.findElement(By.xpath("//span[contains(@class,'toastMessage slds')]/a")).getAttribute("title");
		if(attribute.contains("SATHISH")) {
			System.out.println(attribute+" Opportunity Created");
		}else {
			System.out.println(attribute+" Opportunity not Created");
		}
		driver.close();
	}
}
