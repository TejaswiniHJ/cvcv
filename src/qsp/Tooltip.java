package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./Scripts/chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele =driver.findElement(By.xpath("//a[.='‪ಕನ್ನಡ']"));
		String tooltip=ele.getAttribute("title");
		System.out.println(tooltip);
	}

}
