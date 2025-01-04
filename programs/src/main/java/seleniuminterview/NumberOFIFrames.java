package seleniuminterview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOFIFrames {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://practice-automation.com/iframes/");	
		//driver.switchTo().newWindow(WindowType.TAB);

		List<WebElement> li= driver.findElements(By.xpath("//iframe"));
		System.out.println(li.size());
		
		
			
			driver.switchTo().frame("bottom-iframe");
			// now within the frame you can navigate like you are used to
            System.out.println(driver.findElement(By.xpath("//h4[1]")).getText());
          
		
            
			/*
			 * driver.get("http://the-internet.herokuapp.com/iframe");
			 * 
			 * // find all your iframes List<WebElement> iframes =
			 * driver.findElements(By.xpath("//iframe")); // print your number of frames
			 * System.out.println(iframes.size());
			 * 
			 * // you can reach each frame on your site for (WebElement iframe : iframes) {
			 * 
			 * // switch to every frame driver.switchTo().frame(iframe);
			 * 
			 * // now within the frame you can navigate like you are used to
			 * System.out.println(driver.findElement(By.id("tinymce")).getText()); }
			 */
	}

}
