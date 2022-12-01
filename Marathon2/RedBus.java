package week5.marathon2.java;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class RedBus {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("chennai");
		driver.findElement(By.xpath("//li[@data-no='1']")).click();
		driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//li[@data-no='1']")).click();
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//table//tr[3]//td[5]")).click();
		driver.findElement(By.id("search_btn")).click();
		String number = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText().replaceAll("[^0-9]", "");
		System.out.println(number+" Buses from Chennai To Bangalore");
		Shadow shadow = new Shadow(driver);
		WebElement sleeper = shadow.findElementByXPath("//label[@title='SLEEPER']");
		shadow.scrollTo(sleeper);
		sleeper.click();
		String number1 = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText().replaceAll("[^0-9]", "");
		System.out.println(number1+" Sleeper Buses from Chennai To Bangalore");
		driver.findElement(By.xpath("(//div[text()='View Seats'])[2]")).click();
		Thread.sleep(3000);
		
		WebElement bus = shadow.findElementByXPath("//span[@title='Water Bottle']");
		shadow.scrollTo(bus);
		driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File file = new File("./src/main/java/week5/marathon2/java/RedBus.png");
		FileUtils.copyFile(screenshotAs, file);
		
		

		driver.quit();
		
	}

}