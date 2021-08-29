package qsp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo10 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Scripts/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("tejuhj@gmail.com");
	driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Saitej@1994");
	driver.findElement(By.cssSelector("input[name='hidden']")).click();
}
}