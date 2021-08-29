package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksrevesre {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Scripts/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	List<WebElement> links = driver.findElements(By.tagName("a"));
	int count=links.size();
	System.out.println(count);
	for(int i=count-1; i>0; i--)
	{
		WebElement we = links.get(i);
		String text = we.getText();
		System.out.println(text);
	}
	driver.close();
}
}
