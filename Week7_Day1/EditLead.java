package  week7.day1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditLead extends Browser{
	@BeforeTest
	public void ELdata() {
		filename="EditLeadData";
	}
	@Test(dataProvider = "fetchData")
	public void ELead(String pNumber,String nEmployee,String fName)  {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys(pNumber);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.linkText(fName)).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_numberEmployees")).sendKeys(nEmployee);
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		
	}
}	