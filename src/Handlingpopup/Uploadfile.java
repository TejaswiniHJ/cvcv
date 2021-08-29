package Handlingpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Scripts/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/upload.html");
		WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
		ele.sendKeys("C:\\Users\\Lenovo\\Desktop\\Testcase.xlsx");
				
				
				
				
				
}
}





