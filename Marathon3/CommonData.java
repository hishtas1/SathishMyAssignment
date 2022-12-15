package week7.marathon3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonData {
	public String filename;
	public RemoteWebDriver driver;
	@BeforeMethod
	@Parameters({"url","username","password","browsername"})
	public void BrowserLaunch(String url,String uName,String pWord,String bName) {
		if(bName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions cP = new ChromeOptions();
			cP.addArguments("--disable-notifications");
			driver = new ChromeDriver(cP);
		}else if(bName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions eP = new EdgeOptions();
			eP.addArguments("--disable-notifications");
			driver = new EdgeDriver(eP);	
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pWord);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}
	@AfterMethod
	public void ExitBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	@DataProvider(name = "fetchData")
	public String[][] getData() throws IOException{
		String[][]data=ExcelData.Edata(filename);
		return data;
	}
}
