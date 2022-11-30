package week5.day2.LeafTaps;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MergeContact extends CreateContact{
	@Test(dependsOnMethods = {"CContact"},alwaysRun = true)
	public void MContaxt() {
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> arrayList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(arrayList.get(2));
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8989898901");
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		String id1=driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).getText();
		driver.findElement(By.linkText(id1)).click();
		driver.switchTo().window(arrayList.get(1));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		ArrayList<String> arrayList1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(arrayList1.get(2));
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8989898900");
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		String id2=driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).getText();
		driver.findElement(By.linkText(id2)).click();
		driver.switchTo().window(arrayList.get(1));
		driver.findElement(By.linkText("Merge")).click();
		Alert alertSimple = driver.switchTo().alert();
		alertSimple.accept();
		System.out.println(driver.getTitle());
	}
	
}