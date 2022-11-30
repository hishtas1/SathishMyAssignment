package  week5.day2.LeafTaps;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditLead extends CreateLead{
	@Test(dependsOnMethods = {"CLead"},alwaysRun = true)
	public void ELead()  {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("8989898900");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.linkText("SATHISH")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_numberEmployees")).sendKeys("10");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		
	}
}	