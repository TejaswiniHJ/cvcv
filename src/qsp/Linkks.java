package qsp;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkks {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./Scripts/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.google.com");
			java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
			int count=links.size();
			System.out.println(count);
			
			for(int i=0; i<count; i++)
			{
				WebElement we = links.get(i);
				String text = we.getText();
				System.out.println(text);
				
			}
			driver.close();

}
}
