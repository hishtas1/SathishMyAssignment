package week5.day2.LeafGround;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandlingFrame extends DataH{
	@Test
	public void Frame() {
		driver.findElement(By.xpath("//span[text()='Frame']")).click();
		//Frame
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		String insideFrame = driver.findElement(By.id("Click")).getText();
		System.out.println(insideFrame);
		driver.switchTo().defaultContent();
		//Nested Frame
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		String nestedFrame = driver.findElement(By.id("Click")).getText();
		System.out.println(nestedFrame);
		driver.switchTo().defaultContent();
		//Count Frame
		WebElement findElement = driver.findElement(By.xpath("//iframe[@src='nested.xhtml']"));
		driver.switchTo().frame(findElement);
		driver.findElement(By.id("Click")).click();
		String countFrames = driver.findElement(By.id("Click")).getText();
		System.out.println(countFrames);
		driver.quit();
	}

}
