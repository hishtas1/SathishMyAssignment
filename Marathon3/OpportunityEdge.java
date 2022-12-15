package week7.marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class OpportunityEdge {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions eP = new EdgeOptions();
		eP.addArguments("--disable-notifications");
		EdgeDriver driver = new EdgeDriver(eP);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf$321");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@Class='slds-input']")).sendKeys("sales");
		driver.findElement(By.xpath("(//mark[text()='Sales'])[3]")).click();
		Shadow shadow = new Shadow(driver);
		WebElement ViewAll = driver.findElement(By.xpath("//span[text()='View All Key Deals']"));
		shadow.scrollTo(ViewAll);
		ViewAll.click();
		driver.findElement(By.xpath("//a[@title='New']")).click();
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000");
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button slds-button_icon slds-button_icon-container'])[2]")).click();
		driver.findElement(By.xpath("//table[@class='slds-datepicker__month']//tr[4]//td[3]")).click();
		driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input")).sendKeys("Sathish");
		driver.findElement(By.xpath("//button[@data-value='--None--']")).click();
		driver.findElement(By.xpath("(//span[text()='Value Proposition'])[2]")).click();
		driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("sathish");
		driver.findElement(By.xpath("//strong[text()='SATHISH']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String text = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		System.out.println(text);
		
		

	}

}
