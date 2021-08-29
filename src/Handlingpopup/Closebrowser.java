package Handlingpopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Closebrowser {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Scripts/geckodriver.exe");	
				WebDriver driver=new FirefoxDriver();
				driver.get("https://www.google.com/");
				Thread.sleep(1000);
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_ALT);
				r.keyPress(KeyEvent.VK_SPACE);
				r.keyPress(KeyEvent.VK_C);
				r.keyRelease(KeyEvent.VK_ALT);
				r.keyRelease(KeyEvent.VK_SPACE);
				r.keyRelease(KeyEvent.VK_C);
				
							
}
}
	
