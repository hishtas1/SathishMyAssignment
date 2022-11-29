package week4.day2.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(men).perform();
		driver.findElement(By.xpath("(//a[text()='Jackets'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search brand']")).sendKeys("Duke");
		driver.findElement(By.xpath("//label[text()='Duke']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(@class,'FilterDirectory-close')]")).click();
		driver.findElement(By.xpath("//label[text()='50% and above']")).click();
		driver.findElement(By.xpath("//img[@alt='Duke Men Green Bomber Jacket']")).click();
		Thread.sleep(5000);
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> arrayList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(arrayList.get(2));
		String brand = driver.findElement(By.className("pdp-title")).getText();
		String itemName = driver.findElement(By.className("pdp-name")).getText();
		String rs = driver.findElement(By.className("pdp-price")).getText().replaceAll("[^0-9]", "");
		String oFF = driver.findElement(By.className("pdp-discount")).getText();
		System.out.println("Brand Name:	"+brand+"\nItem Name:	"+itemName+"\nRate:	Rs."+rs+"\nDiscount:	"+oFF);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File file = new File("./src/main/java/week4/day2/assignments/Myntra.png");
		FileUtils.copyFile(screenshotAs, file);
		driver.findElement(By.xpath("//span[text()='WISHLIST']")).click();
		driver.quit();
	}
	
}
