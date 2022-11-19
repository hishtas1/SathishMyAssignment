package week4.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlerts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//Simple Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert alertSimple = driver.switchTo().alert();
		String textSimple = alertSimple.getText();
		alertSimple.accept();
		System.out.println("Simple Alert :"+textSimple);
		String youSimple = driver.findElement(By.id("simple_result")).getText();
		System.out.println(youSimple);
	//Confirm Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert alertConfirm = driver.switchTo().alert();
		String textConfirm = alertSimple.getText();
		alertConfirm.accept();
		System.out.println("Confirm Alert :"+textConfirm);
		String youConfirm = driver.findElement(By.id("result")).getText();
		System.out.println(youConfirm);
	//Sweet Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		String textSweet = driver.findElement(By.xpath("//div[@class='ui-dialog-content ui-widget-content']//p")).getText();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		System.out.println("Sweet Alert :"+textSweet);
	//Sweet modal Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		String textSweetModal = driver.findElement(By.xpath("//p[@class='m-0']")).getText();
		System.out.println("Sweet Alert Modal :"+textSweetModal);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	//Prompt Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alertPrompt = driver.switchTo().alert();
		String textPrompt = alertPrompt.getText();
		alertPrompt.sendKeys("SATHISH");
		alertConfirm.accept();
		System.out.println("Prompt Alert :"+textPrompt);
		String youPrompt = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(youPrompt);
	//Sweet Alert Delete
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		String textSweetConfirm = driver.findElement(By.className("ui-confirm-dialog-message")).getText();
		System.out.println("Sweet Alert Confirm :"+textSweetConfirm);
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
	//Sweet Alert Minimize and Maximize
		driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
		String textSweetMaxMin = driver.findElement(By.xpath("(//p[@class='m-0'])[2]")).getText();
		System.out.println("Sweet Alert Max Min :"+textSweetMaxMin);
		driver.findElement(By.xpath("(//a[@role='button'])[3]")).click();
		driver.quit();
	}
}
