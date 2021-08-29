package Disableelehandle;



	
import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class Scrollspecific {
	

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver","./Scripts/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.xpath("//a[@class='nav_a']"));
		org.openqa.selenium.Point loc=ele.getLocation();
		 System.out.println(loc);
		 int x=loc.getX();
		 int y=loc.getY();
		 Thread.sleep(1000);
		 js.executeScript("window.ScrollBy("+x+", "+y+")");
		 		
		 Thread.sleep(1000);
		 ele.click();
		 
		
		
}
	}
