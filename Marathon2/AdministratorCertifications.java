package week5.marathon2.java;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class AdministratorCertifications {
	
	public static void main(String[] args) throws InterruptedException {
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
		WebElement mouseOver = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions actions = new Actions(driver);
		actions.moveToElement(mouseOver).perform();
		WebElement certificate = shadow.findElementByXPath("//a[text()='Salesforce Certification']");
		shadow.scrollTo(certificate);
		certificate.click();
		driver.findElement(By.xpath("//div[text()='Administrator']")).click();
		System.out.println("<ADMINISTRATOR CERTIFICATIONS>");
		List<WebElement> architectCertificate = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		for (int i = 0; i < architectCertificate.size(); i++) {
			System.out.println(architectCertificate.get(i).getText());		
		}
		driver.quit();

	}
}