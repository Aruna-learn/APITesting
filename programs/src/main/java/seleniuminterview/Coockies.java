package seleniuminterview;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Coockies {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		// Add cookie in key-value pairs
		Cookie ck=new Cookie("c1","aruna");
		
		System.out.println(ck);
		driver.manage().addCookie(ck);
		 
		System.out.println(driver.manage().getCookieNamed("at"));
		System.out.println(driver.manage().getCookies());
		System.out.println(driver.manage().getCookies().size());
		//System.out.println(driver.manage().deleteCookieNamed("vw"));
		System.out.println(driver.manage().getCookies().size());
		//System.out.println(driver.manage().deleteAllCookies());
		System.out.println(driver.manage().getCookies().size());
		
		
		

	}

}
