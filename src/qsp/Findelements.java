package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.stylesheets.LinkStyle;

public class Findelements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Scripts/chromedriver.exe");	
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com/");
				List<WebElement> links =driver.findElements(By.xpath("//a"));
				int count=links.size();
				System.out.println(count);


}
}
