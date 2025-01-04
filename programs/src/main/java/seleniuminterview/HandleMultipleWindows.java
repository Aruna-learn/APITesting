package seleniuminterview;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		String parent=driver.getWindowHandle();
		System.out.println("parentwidnow handle:"+parent.toString());

		Set<String> handles=driver.getWindowHandles();

		for(String child:handles) {
			String title=driver.switchTo().window(child).getTitle();
			System.out.println(title);
			if(title.equals("XPath Practice - H Y R Tutorials")) {
				driver.switchTo().window("XPath Practice - H Y R Tutorials");
				driver.findElement(By.xpath("//input[@maxlength=10]")).sendKeys("aruna");
				driver.close();
			}
		}
	

//	if(title.equals("Basic Controls - H Y R Tutorials"))
//	{
//		driver.switchTo().window("Basic Controls - H Y R Tutorials");
//		driver.findElement(By.id("lastName")).sendKeys("poololla");
//		driver.close();
//	}


}

}


