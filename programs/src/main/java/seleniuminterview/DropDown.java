package seleniuminterview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		//		driver.get("https://www.browserstack.com/");
		//		
		//		WebElement dp=driver.findElement(By.id("developers-dd-toggle"));
		//				
		//		List<WebElement> all=driver.findElements(By.xpath("//div[@class='bstack-mm-sub-li']/a"));
		//		
		//		System.out.println(all);
		//		String op="Status";
		//		
		//		for(WebElement option:all) {
		//			if(option.getText().contains(op)) {
		//				option.click();
		//			}
		//		}

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		WebElement dp=driver.findElement(By.id("course"));

		List<WebElement> all=driver.findElements(By.xpath("//Select[@id='course']/option"));

		System.out.println(all);
		Select sel=new Select(dp);
		sel.selectByValue("python");

	}

}
