package week7.marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChatterChrome {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cP = new ChromeOptions();
		cP.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(cP);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf$321");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@Class='slds-input']")).sendKeys("chatter");
		driver.findElement(By.xpath("(//mark[text()='Chatter'])[1]")).click();
		WebElement click = driver.findElement(By.xpath("//span[text()='Chatter']"));
		driver.executeScript("arguments[0].click();", click);
		driver.findElement(By.xpath("//span[text()='Question']")).click();
		driver.findElement(By.xpath("//textarea[@role='textbox']")).sendKeys("If you could live anywhere, where would it be?");
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("Spot");
		driver.findElement(By.xpath("//button[text()='Ask']")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("(//div[contains(@class,'cuf-body cuf-questionTitle')]//span)[1]")).getText();
		
		System.out.println(text);
		if(text.equalsIgnoreCase("If you could live anywhere, where would it be?")) {
			System.out.println("Your Question is Available");
		}else {
			System.out.println("Your Question is Not Available");
		}
		
		
		
	}

}
