package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("sathish");
		driver.findElement(By.name("lastname")).sendKeys("shanmugasundaram");
		driver.findElement(By.name("reg_email__")).sendKeys("7397111703");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Sathish123");
		WebElement birthdayday = driver.findElement(By.name("birthday_day")); 
		Select day = new Select(birthdayday); 
		day.selectByValue("8");
		WebElement birthdaymonth = driver.findElement(By.name("birthday_month")); 
		Select month = new Select(birthdaymonth);
		month.selectByVisibleText("Sep"); 
		WebElement birthdayyear = driver.findElement(By.name("birthday_year")); 
		Select year = new Select(birthdayyear);
		year.selectByValue("1998"); 
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.findElement(By.name("websubmit")).click();
	}

}
