package week5.day2.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Opportunities extends DataS {
	@Test
	public void Opp() throws InterruptedException {
		WebElement click1 = driver.findElement(By.xpath("//p[text()='Sales']"));
		driver.executeScript("arguments[0].click();",click1);
		WebElement click2 = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();",click2);
		driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
		driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("SATHISH");
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("10/11/2022");
		driver.findElement(By.xpath("(//button[@data-value='--None--'])[1]")).click();
		driver.findElement(By.xpath("//span[@title='Qualification']")).click();
		driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("SATHISH");
		driver.findElement(By.xpath("//strong[text()='SATHISH']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String attribute = driver.findElement(By.xpath("//span[contains(@class,'toastMessage slds')]/a")).getAttribute("title");
		if(attribute.contains("SATHISH")) {
			System.out.println(attribute+" Opportunity Created");
		}else {
			System.out.println(attribute+" Opportunity not Created");
		}
	}
}
