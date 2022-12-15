package week7.marathon3;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Contact extends CommonData{
	@BeforeTest
	public void Conta() {
		filename="Contact";
	}
	@Test(dataProvider = "fetchData")
	public void Cont(String salutation,String name) {
		driver.findElement(By.xpath("//input[@Class='slds-input']")).sendKeys("contacts");
		driver.findElement(By.xpath("//mark[text()='Contacts']")).click();
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//button[@name='salutation']")).click();
		driver.findElement(By.xpath("//span[text()='"+salutation+"']")).click();
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(name);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String text = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		System.out.println(text);

	}

}
