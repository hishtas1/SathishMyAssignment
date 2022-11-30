package week5.day2.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateAccount extends DataS {
	@Test
	public void CAccount() {
		WebElement click1 = driver.findElement(By.xpath("//p[text()='Sales']"));
		driver.executeScript("arguments[0].click();",click1);
		WebElement click2 = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();",click2);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("SATHISH");
		WebElement click3 = driver.findElement(By.xpath("(//button[@data-value='--None--'])[3]"));
		driver.executeScript("arguments[0].click();",click3);
		driver.findElement(By.xpath("//span[text()='Public']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String attribute = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']/a")).getAttribute("title");
		System.out.println(attribute);
		if(attribute.contains("SATHISH")) {
			System.out.println(attribute+" Account Created");
		}else {
			System.out.println(attribute+" Account not Created");
		}
	}
}
