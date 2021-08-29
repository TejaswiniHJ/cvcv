package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fwdbwdrefresh{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Scripts/chromedriver.exe");	
				WebDriver driver=new ChromeDriver();
				driver.navigate().to("https://www.google.com/");
				driver.navigate().to("https://www.amazon.com/");
				Thread.sleep(1000);
				driver.navigate().back();
				Thread.sleep(1000);
				driver.navigate().forward();
				Thread.sleep(1000);
				driver.navigate().refresh();
				
				
	}
				


}
