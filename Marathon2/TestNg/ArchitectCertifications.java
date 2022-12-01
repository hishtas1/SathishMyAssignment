package week5.marathon2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import io.github.sukgu.Shadow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ArchitectCertifications {
	@Test
	public void ArchitectCertification() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//button[@title='Learn More']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> arrayList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(arrayList.get(2));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("//span[text()='Learning']").click();
		//WebElement learning = shadow.findElementByXPath("//span[text()='Learning']");
		//learning.click();
		WebElement mouseOver = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions actions = new Actions(driver);
		actions.moveToElement(mouseOver).perform();
		WebElement certificate = shadow.findElementByXPath("//a[text()='Salesforce Certification']");
		shadow.scrollTo(certificate);
		certificate.click();
		
		//String text = driver.findElement(By.xpath("(//div[contains(@class,'slds-p-bottom--large')])[1]")).getText();
		//System.out.println(driver.findElement(By.xpath("//div[contains(@class,'cert-site_text slds-text')]")).getText());
			
		driver.findElement(By.xpath("//div[text()='Architect']")).click();
		WebElement a = driver.findElement(By.xpath("(//div[@class='credentials-card_title'])[1]"));
		shadow.scrollTo(a);
		System.out.println("<ARCHITECT CERTIFICATIONS>");
		List<WebElement> architectCertificate = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		for (int i = 0; i < architectCertificate.size(); i++) {
			System.out.println(architectCertificate.get(i).getText());		
		}
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
		WebElement b = driver.findElement(By.xpath("(//div[@class='credentials-card_title'])[1]"));
		shadow.scrollTo(b);
		System.out.println("<APPLICATION ARCHITECT>");
		List<WebElement> applicationCertificate = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		for (int i = 0; i < 4; i++) {
			System.out.println(applicationCertificate.get(i).getText());		
		}
		driver.quit();
	}

}
/*
 * Testcase:1
Architect Certifications
==========================
1. Launch Salesforce application https://login.salesforce.com/
2. Login with Provided Credentials
3. Click on Learn More link in Mobile Publisher  and click Confirm
4. Click Learning and Mouse hover on Learning On Trailhead
5. Select SalesForce Certification 
6. Choose Your Role as Salesforce Architect and verify the URL
7. Get the Text(Summary) of Salesforce Architect 
8. Get the List of Salesforce Architect Certifications Available
9. Click on Application Architect 
10.Get the List of Certifications available
Credentials:
hari.radhakrishnan@qeagle.com
Testleaf$321
 */
