package week5.day2.LeafGround;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataH {
	public ChromeDriver driver;
	@BeforeMethod
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
	}
	@AfterMethod
	public void ExitBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
