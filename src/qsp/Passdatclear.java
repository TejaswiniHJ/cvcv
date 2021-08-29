package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passdatclear {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Scripts/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/txt.html");
		List<WebElement> textbox =driver.findElements(By.xpath("//input"));
		int count= textbox.size();
		for(WebElement we:textbox)
			
		{
	we.sendKeys("abc");
		}
		for(int i=count-1; i>=0; i--)
		{
		WebElement we1=textbox.get(i);
		we1.clear();
		}
		
		
	}
}

		
		
		
