package Disableelehandle;



	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Scrollpixcel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Scripts/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0; i<3; i++ )
		{
			
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
			
		}
		for(int i=0; i<3; i++ )
		{
			js.executeScript("window.scrollBy(0,-500)");	
			Thread.sleep(1000);
		}
	}
	
	
	}


