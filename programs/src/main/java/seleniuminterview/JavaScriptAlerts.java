package seleniuminterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlerts {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
//		System.out.println(driver.findElement(By.xpath("//div[@id='output']/..")).getText());
//		driver.findElement(By.id("alertBox")).click();
//		driver.switchTo().alert().accept();
		//System.out.println(driver.findElement(By.xpath("//div[@id='output']/..")).getText());
		
		
		
//		driver.findElement(By.id("confirmBox")).click();
//		driver.switchTo().alert().accept();
//		System.out.println(driver.findElement(By.xpath("//div[@id='output']/..")).getText());
		
//		driver.findElement(By.id("confirmBox")).click();
//		driver.switchTo().alert().dismiss();
//		System.out.println(driver.findElement(By.xpath("//div[@id='output']/..")).getText());
		
		driver.findElement(By.id("promptBox")).click();
		driver.switchTo().alert().sendKeys("aruna");
		System.out.println(driver.findElement(By.xpath("//div[@id='output']/..")).getText());
	}

}
