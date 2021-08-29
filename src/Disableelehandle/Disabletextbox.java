package Disableelehandle;


	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Disabletextbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Scripts/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/disable.html");
		Thread.sleep(1000);
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("document.getElementById('t1').value='xyz'");
			
		}
	}
	
	
	}


