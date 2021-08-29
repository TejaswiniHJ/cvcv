package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textprint {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Scripts/chromedriver.exe");	
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com/");
				WebElement ele =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/a"));
				String text=ele.getText();
				System.out.println(text);
}
}

	