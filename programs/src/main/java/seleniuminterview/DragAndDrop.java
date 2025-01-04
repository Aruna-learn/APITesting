package seleniuminterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/drag_and_drop");

		Actions act=new Actions(driver);

		WebElement from=driver.findElement(By.id("column-a"));
		WebElement to=driver.findElement(By.id("column-b"));
		Thread.sleep(4000);
		act.dragAndDrop(from, to).perform();

		DesiredCapabilities caps=new DesiredCapabilities();


		caps.setBrowserName("chrome");

	}

}
