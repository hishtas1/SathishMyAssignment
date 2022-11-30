package week5.day2.SalesForce;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateTask extends DataS{
	@Test
	public void CTask()  {
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Task");
		driver.findElement(By.xpath("//lightning-formatted-rich-text[@class='slds-rich-text-editor__output']//p[1]")).click();
		driver.findElement(By.xpath("//a[@title='Show one more action']")).click();
		driver.findElement(By.xpath("//a[@title='New Task']")).click();
		driver.findElement(By.xpath("//a[@class='select']")).click();
		driver.findElement(By.xpath("//a[@title='Waiting on someone else']")).click();
		driver.findElement(By.xpath("(//input[@role='combobox'])[2]")).sendKeys("Bootcamp");
		driver.findElement(By.xpath("(//button[@data-aura-class='uiButton forceActionButton'])[3]")).click();
		String attribute = driver.findElement(By.xpath("//span[contains(@class,'toastMessage slds')]/a")).getAttribute("title");
		if(attribute.contains("Bootcamp")) {
			System.out.println(attribute+" Task Created");
		}else {
			System.out.println(attribute+" Task not Created");
		}
	}

}
