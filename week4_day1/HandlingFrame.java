package week4.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Frame
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		String insideFrame = driver.findElement(By.id("Click")).getText();
		System.out.println(insideFrame);
		driver.switchTo().defaultContent();
		//Nested Frame
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		String nestedFrame = driver.findElement(By.id("Click")).getText();
		System.out.println(nestedFrame);
		driver.switchTo().defaultContent();
		//Count Frame
		WebElement findElement = driver.findElement(By.xpath("//iframe[@src='nested.xhtml']"));
		driver.switchTo().frame(findElement);
		driver.findElement(By.id("Click")).click();
		String countFrames = driver.findElement(By.id("Click")).getText();
		System.out.println(countFrames);
		driver.quit();
	}

}
