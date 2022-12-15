package week7.marathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class Opportunity extends CommonData {
	@BeforeTest
	public void Oppo() {
		filename="Opportunity";
	}
	@Test(dataProvider = "fetchData")
	public void Opp(String amount,String name,String lead,String stage) {
		driver.findElement(By.xpath("//input[@Class='slds-input']")).sendKeys("sales");
		driver.findElement(By.xpath("(//mark[text()='Sales'])[3]")).click();
		Shadow shadow = new Shadow(driver);
		WebElement ViewAll = driver.findElement(By.xpath("//span[text()='View All Key Deals']"));
		shadow.scrollTo(ViewAll);
		ViewAll.click();
		driver.findElement(By.xpath("//a[@title='New']")).click();
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amount);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button slds-button_icon slds-button_icon-container'])[2]")).click();
		driver.findElement(By.xpath("//table[@class='slds-datepicker__month']//tr[4]//td[3]")).click();
		driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input")).sendKeys(name);
		driver.findElement(By.xpath("//button[@data-value='--None--']")).click();
		driver.findElement(By.xpath("//span[@title='"+stage+"']")).click();
		driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys(name);
		driver.findElement(By.xpath("//strong[text()='"+lead+"']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String text = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		System.out.println(text);

	}

}
