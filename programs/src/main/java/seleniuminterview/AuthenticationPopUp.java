package seleniuminterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class AuthenticationPopUp {

	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	WebElement msg=	driver.findElement(By.xpath("//p"));
		
	//Assert.assertEquals(msg, “Congratulations! You must have the proper credentials.”);
		
	//driver.get("https://username:password@URL");

	}

}
