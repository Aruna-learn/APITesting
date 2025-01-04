package seleniuminterview;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v127.page.model.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws Exception{

		// Setting your Chrome options (Desired capabilities)
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(options);

		driver.get("https://www.flipkart.com");

		//File f=new File("C:\\Software\\Aruna_JAVA\\programs\\Resources\\scn.png");

		//FileInputStream fis=new FileInputStream(f);

		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
//		File dest=new File("C:\\Software\\Aruna_JAVA\\programs\\Resources\\scn.png");
//		org.openqa.selenium.io.FileHandler.copy(src, dest);
//		System.out.println("screenshot savd");

		
		// capture screenshot and store the image
        //ru.yandex.qatools.ashot.Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(5000)).takeScreenshot(driver);
        //ImageIO.write(s.getImage(),"PNG",new File("C:\\Software\\Aruna_JAVA\\programs\\Resources\\fullpage1.png"));
WebElement scrn=driver.findElement(By.xpath("//img[@alt='Grocery']"));


File source = ((TakesScreenshot)scrn).getScreenshotAs(OutputType.FILE);
org.openqa.selenium.io.FileHandler.copy(source, new File("C:\\Software\\Aruna_JAVA\\programs\\Resources\\element.png"));

		
		
		
		
	}

}
