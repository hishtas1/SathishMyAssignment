package week5.day2.LeafTaps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteContact extends MergeContact{
	@Test(dependsOnMethods = {"MContaxt"},alwaysRun = true)
	public void DContaxt() {
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Find Contacts")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("8989898900");
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		driver.findElement(By.linkText("SATHISH")).click();
		driver.findElement(By.linkText("Deactivate Contact")).click();
		Alert alertSimple = driver.switchTo().alert();
		alertSimple.accept();
		System.out.println(driver.findElement(By.className("subSectionWarning")).getText());
	}
}
