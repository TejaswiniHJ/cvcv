package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipcart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./Scripts/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com/account/login?sid=SI138088739218043902899");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("tejuhj@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("23456");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("watches");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
}
}
