package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urlprint {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Scripts/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> links =driver.findElements(By.xpath("//a"));
		
		for(WebElement we:links)
		{
			String text=we.getAttribute("href");
			System.out.println(text);
			
		}
		
}
}