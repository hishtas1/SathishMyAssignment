package week7.marathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chatter extends CommonData{
	@BeforeTest
	public void Chatt() {
		filename="Chatter";
	}
	@Test(dataProvider = "fetchData")
	public void Chat(String question,String description) throws InterruptedException {
		driver.findElement(By.xpath("//input[@Class='slds-input']")).sendKeys("chatter");
		driver.findElement(By.xpath("(//mark[text()='Chatter'])[1]")).click();
		WebElement click = driver.findElement(By.xpath("//span[text()='Chatter']"));
		driver.executeScript("arguments[0].click();", click);
		driver.findElement(By.xpath("//span[text()='Question']")).click();
		driver.findElement(By.xpath("//textarea[@role='textbox']")).sendKeys(question);
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys(description);
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
