package week5.day2.LeafTaps;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends Data{
	
	@Test
	public void CLead() {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SSEW");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SATHISH");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CEO");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("OWNER");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sathish@ssew.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8989898900");
		driver.findElement(By.className("smallSubmit")).click();
		String LID = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Lead ID: "+LID);
	
	}
}
