package week5.day2.LeafGround;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandlingWindow extends DataH{
	@Test(timeOut = 5000)
	public void Window() throws IOException {
		driver.findElement(By.xpath("//span[text()='Window']")).click();
	//Click and Confirm new Window Opens
		System.out.println("Click and Confirm new Window Opens");
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		System.out.println("Tab Name : "+driver.getTitle());
		Set<String> windowHandles1 = driver.getWindowHandles();
		ArrayList<String> arrayList1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(arrayList1.get(0));
		driver.close();
		driver.switchTo().window(arrayList1.get(2));
		System.out.println("Tab Name : "+driver.getTitle());
		driver.close();
		driver.switchTo().window(arrayList1.get(1));
		System.out.println("Tab Name : "+driver.getTitle());
	//Find the Number of Opened Tabs
		System.out.println("Find the Number of Opened Tabs");
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		ArrayList<String> arrayList2 = new ArrayList<String>(windowHandles2);
		System.out.println("Number of Tabs Opened : "+arrayList2.size());
		System.out.println("Tab Name : "+driver.getTitle());
		driver.switchTo().window(arrayList2.get(1));
		System.out.println("Tab Name : "+driver.getTitle());
		driver.close();
		driver.switchTo().window(arrayList2.get(2));
		System.out.println("Tab Name : "+driver.getTitle());
		driver.close();	
		driver.switchTo().window(arrayList2.get(0));
		System.out.println("Tab Name : "+driver.getTitle());
	//Open with Delay
		System.out.println("Open with Delay");
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		ArrayList<String> arrayList3 = new ArrayList<String>(windowHandles3);
		driver.switchTo().window(arrayList3.get(1));
		System.out.println("Tab Name : "+driver.getTitle());
		driver.close();
		driver.switchTo().window(arrayList3.get(2));
		System.out.println("Tab Name : "+driver.getTitle());
		driver.close();
		driver.switchTo().window(arrayList2.get(0));
		System.out.println("Tab Name : "+driver.getTitle());
	//Close Window
		System.out.println("Close Window");
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> windowHandles4 = driver.getWindowHandles();
		ArrayList<String> arrayList4 = new ArrayList<String>(windowHandles4);
		driver.switchTo().window(arrayList4.get(1));
		System.out.println("Tab Name : "+driver.getTitle());
		driver.close();
		driver.switchTo().window(arrayList4.get(2));
		System.out.println("Tab Name : "+driver.getTitle());
		driver.close();
		driver.switchTo().window(arrayList4.get(3));
		System.out.println("Tab Name : "+driver.getTitle());
		driver.close();
		driver.switchTo().window(arrayList2.get(0));
		System.out.println("Tab Name : "+driver.getTitle());
	}
}
