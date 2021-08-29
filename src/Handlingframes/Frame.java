package Handlingframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Scripts/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Lenovo/Desktop/mainpage.html");
	driver.findElement(By.id("t1")).sendKeys("hello");
	WebElement ele=driver.findElement(By.xpath("//iframe[@id='f1']"));
	driver.switchTo().frame(0);
	driver.findElement(By.id("t3")).sendKeys("hii");
	driver.switchTo().frame(0);
	driver.findElement(By.id("t2")).sendKeys("hihello");
	
			
}
	}
