package week5.day2.LeafTaps;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DuplicateLead extends EditLead{
	@Test(dependsOnMethods = {"ELead"},alwaysRun = true)
	public void DupLead()  {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("8989898900");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.linkText("SATHISH")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String DLID = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Lead ID: "+DLID);
		
		
	}
}
