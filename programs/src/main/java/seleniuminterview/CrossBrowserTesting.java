package seleniuminterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class CrossBrowserTesting {
WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	
	public void setup(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		
	}
		
//		@Test
//	      public void verifyTitle() {
//	            driver.get("https://www.browserstack.com/");
//	            System.out.println("Title is: " + driver.getTitle());
//	            Assert.assertEquals(driver.getTitle(), "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
//	            driver.quit();
//	      }
	}


