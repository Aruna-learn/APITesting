package seleniuminterview;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScrpitExecutor {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		driver.get("https://www.browserstack.com/users/sign_in");
		js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");
		js.executeScript("document.getElementById('user_password').value='password';");
		js.executeScript("document.getElementById('user_submit').click();");
		js.executeScript("alert('enter correct login credentials to continue');");
		//js.executeScript("window.scrollTo(0,1000)");
		
		
	}

}
