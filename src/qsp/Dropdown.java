package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Scripts/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/dropdown.html");
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.id("Orion"));
		Select s=new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByValue("a");
		Thread.sleep(1000);
		s.selectByVisibleText("Westside");
		Thread.sleep(1000);
		s.deselectAll();
		
	}
}
