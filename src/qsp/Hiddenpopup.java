package qsp;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenpopup {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Scripts/chromedriver.exe");	
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.cleartrip.com/");
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//div[.='Wed, Jul 14'])[6]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//div[.='18'])[3]")).click();
}
}
