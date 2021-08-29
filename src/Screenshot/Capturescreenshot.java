package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturescreenshot {

	public static void main(String[] args) throws InterruptedException, IOException  {
		System.setProperty("webdriver.gecko.driver","./Scripts/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(1000);
	    TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("E:\\Screen\\amazon.jpeg");
		FileUtils.copyFile(src, dst);
		
	}	
		
		
}
