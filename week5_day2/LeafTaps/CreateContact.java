package week5.day2.LeafTaps;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContact extends Data{
	@Test(dataProvider = "create")
	public void CContact(String FName, String LName, String DName,String Description ,String Email, String PNumber) {
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys(FName);
		driver.findElement(By.id("lastNameField")).sendKeys(LName);
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys(DName);
		driver.findElement(By.id("createContactForm_description")).sendKeys(Description);
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys(Email);
		driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys(PNumber);
		driver.findElement(By.className("smallSubmit")).click();
	}
	@DataProvider(name="create")
	public String[][] getData() {        
		String [][] data=new String[2][6];
		
		data[0][0]="SATHISH";
		data[0][1]="S";
		data[0][2]="CEO";
		data[0][3]="OWNER";
		data[0][4]="sathish@ssew.com";
		data[0][5]="8989898900";
		
		data[1][0]="CLADWIN";
		data[1][1]="ANNAN";
		data[1][2]="PATNER";
		data[1][3]="PATNER";
		data[1][4]="cladwin@ssew.com";
		data[1][5]="8989898901";
		
		return data;
		
	}
}
