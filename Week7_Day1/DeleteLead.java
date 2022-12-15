package week7.day1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteLead extends Browser{
	@BeforeTest
	public void ELdata() {
		filename="DeleteLeadData";
	}
	@Test(dataProvider = "fetchData")
	public void DelLead(String pNumber, String fName)  {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();	
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys(pNumber);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.linkText(fName)).click();
		driver.findElement(By.linkText("Delete")).click();
	
	}
}
