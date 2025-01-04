package seleniuminterview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DifferentWaysToClick {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		//using js click
		//		JavascriptExecutor js= (JavascriptExecutor)driver;
		//		driver.get("https://www.browserstack.com/users/sign_in");
		//		js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");
		//		js.executeScript("document.getElementById('user_password').value='password';");
		//		js.executeScript("document.getElementById('user_submit').click();");

		//using normal clickmethod
		driver.get("https://www.browserstack.com/users/sign_in");
		//		driver.findElement(By.id("user_email_login")).sendKeys("aruna.xyaz@com");
		//		driver.findElement(By.id("user_password")).sendKeys("aruna124");
		//
		//		driver.findElement(By.name("commit")).click();



		//using actionsclick like sendkeys keys sequence and left right click
		Actions act=new Actions(driver);
		driver.findElement(By.id("user_email_login")).sendKeys("aruna.xyaz@com");
		driver.findElement(By.id("user_password")).sendKeys("aruna124");

		WebElement cl=driver.findElement(By.name("commit"));

		cl.sendKeys(Keys.ENTER);

	}

}
