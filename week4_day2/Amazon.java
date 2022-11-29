package week4.day2.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		String PP = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Price of the Product: "+PP);
		String CR = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("Customer Ratings of the Product: "+CR);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-popover'])[1]")).click();
		String RP = driver.findElement(By.xpath("//span[@data-hook='acr-average-stars-rating-text']")).getText();
		System.out.println("Rating Percentage of the Product: "+RP);
		driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base')])[1]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		ArrayList<String> arrayList1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(arrayList1.get(2));
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File file = new File("./src/main/java/week4/day2/assignments/amazon.png");
		FileUtils.copyFile(screenshotAs, file);
		driver.findElement(By.id("add-to-cart-button")).click();
		String CP = driver.findElement(By.xpath("(//span[@id='attach-accessory-cart-subtotal'])[1]")).getText();
		System.out.println("Cart Price: "+CP);
		if(PP==CP) {
			System.out.println("Payment Amount is Correct");
		}else {
			System.out.println("Payment Amount is not Correct");
		}
		driver.quit();
	}
}
