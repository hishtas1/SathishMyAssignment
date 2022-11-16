package week3.day2;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.tagName("input")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String itemsFound = driver.findElement(By.className("length")).getText();
		System.out.println("Total "+itemsFound);
		driver.findElement(By.xpath("//span[text()='brands']")).click();
		driver.findElement(By.xpath("(//div[@class='facet-more'])[2]")).click();
		List<WebElement> brands = driver.findElements(By.xpath("//span[@class='facet-list-title-name']"));
		int brandNumber=brands.size();
		System.out.println("Total Number of Brand Found "+brandNumber);
		System.out.println("BRAND NAMES");
		for (WebElement webElement : brands) {
			String brandNames = webElement.getText();
			System.out.println(brandNames);
		}
		
	}
}