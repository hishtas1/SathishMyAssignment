package week7.day1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends Browser{
	@BeforeTest
	public void CLdata() {
		filename="CreateLeadData";
	}	
	@Test(dataProvider = "fetchData")
	public void CLead(String cName,String fName, String lName,String pNumber) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pNumber);
		driver.findElement(By.className("smallSubmit")).click();
	}
	
}
