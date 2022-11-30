package week5.day2.LeafTaps;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteLead extends DuplicateLead{
	@Test(invocationCount = 2,dependsOnMethods = {"DupLead"},alwaysRun = true)
	public void DelLead()  {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();	
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("8989898900");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.linkText("SATHISH")).click();
		driver.findElement(By.linkText("Delete")).click();
	
	}
}
