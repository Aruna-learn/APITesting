package seleniuminterview;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.srollBy(0,document.body.scrooIntoHeight)");
		
		
		

	}

}
