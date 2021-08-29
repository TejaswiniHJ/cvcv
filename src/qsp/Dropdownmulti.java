package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownmulti {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Scripts/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/dropdown.html");
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.id("Orion"));
		Select s=new Select(ele);
		s.selectByIndex(2);
		Thread.sleep(1000);
		boolean b=s.isMultiple();
		if(b)
		{
			System.out.println("Multi select dropdown");
		}
			else
			{
				System.out.println("Single  select dropdown");
			}
		}
		
}

