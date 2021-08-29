package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datacp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Scripts/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Lenovo/Desktop/copydata.html");
	WebElement ele=driver.findElement(By.xpath("//input[@type='text' and @value='abc']"));
	WebElement ele1=driver.findElement(By.xpath("//input[@type='text' and @value='xyz']"));
	ele.sendKeys(Keys.CONTROL+"a");
	ele.sendKeys(Keys.CONTROL+"c");
	Thread.sleep(1000);
	ele1.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(1000);
	ele1.sendKeys(Keys.DELETE);
	ele1.sendKeys(Keys.CONTROL+"v");
}
}
