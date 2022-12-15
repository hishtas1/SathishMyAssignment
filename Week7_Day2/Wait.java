package week7.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cP = new ChromeOptions();
		cP.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(cP);
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement click1 = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
		click1.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(click1));
		String text = driver.findElement(By.xpath("//button[@name='j_idt87:j_idt90']")).getText();
		System.out.println(text);
		if(text.contains("here"))
        {
        	System.out.println("I am Visible");	
        }else {
        	System.out.println("I am Invisible");
        }
		WebElement click2 = driver.findElement(By.xpath("(//span[text()='Click'])[2]"));
		String text2 = driver.findElement(By.xpath("(//button[@type='submit']//span)[4]")).getText();
		click2.click();
		System.out.println(text2);
		wait.until(ExpectedConditions.visibilityOf(click2));
		Thread.sleep(10000);
		String text3 = driver.findElement(By.xpath("(//button[@type='submit']//span)[4]")).getText();
		if(text3.contentEquals(text2)) {
			System.out.println("I am not Hidden");
		}else {
			System.out.println("I am Hidden");
		}
		String text4 = driver.findElement(By.xpath("(//button[@role='button']//span)[7]")).getText();
		System.out.println(text4);
		WebElement click3 = driver.findElement(By.xpath("(//span[text()='Click'])[3]"));
		wait.until(ExpectedConditions.visibilityOf(click3));
		click3.click();
		Thread.sleep(10000);
		String text5 = driver.findElement(By.xpath("(//button[@role='button']//span)[7]")).getText();
		System.out.println(text5);
		WebElement click4 = driver.findElement(By.xpath("//span[text()='Click Second']"));
	    driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
	    wait.until(ExpectedConditions.elementToBeClickable(click4));
	    driver.quit();
	}
}
		