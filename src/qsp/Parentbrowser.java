package qsp;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentbrowser {


	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Scripts/chromedriver.exe");	
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.naukri.com/");
				Thread.sleep(1000);
				String parent_id = driver.getWindowHandle();
				System.out.println(parent_id);
				
}
}