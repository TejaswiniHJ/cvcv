package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clicklink {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Scripts/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Lenovo/Desktop/Clicklink.html");
	WebElement ele = driver.findElement(By.xpath("//a[@name='n']"));
	ele.sendKeys(Keys.ENTER);
}

}
