package Handlingpopup;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Minimizebrowser {


		public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.gecko.driver","./Scripts/geckodriver.exe");	
					WebDriver driver=new FirefoxDriver();
					driver.get("https://www.google.com/");
					Thread.sleep(1000);
					Robot r=new Robot();
					r.keyPress(KeyEvent.VK_ALT);
					r.keyPress(KeyEvent.VK_SPACE);
					r.keyPress(KeyEvent.VK_N);
					r.keyRelease(KeyEvent.VK_ALT);
					r.keyRelease(KeyEvent.VK_SPACE);
					r.keyRelease(KeyEvent.VK_N);
					Thread.sleep(1000);
					driver.manage().window().maximize();
									
					
	}
	}


