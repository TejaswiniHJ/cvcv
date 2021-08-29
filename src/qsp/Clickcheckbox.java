package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickcheckbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Scripts/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/checkbox.html");
		List<WebElement> check = driver.findElements(By.tagName("input"));
		int count=check.size();
		System.out.println(count);
		for(int i=0; i<count; i++)
		{
			WebElement we=check.get(i);
			we.click();
			Thread.sleep(2000);
		}
		for(int i=count-1; i>=0; i--)
		{
			WebElement We1 = check.get(i);
			We1.click();
			Thread.sleep(1000);
			
	}
		
		
	}

}
