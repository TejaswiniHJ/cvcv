package qsp;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo14{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Scripts/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.googlemaps.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='searchboxinput']")).sendKeys("bangalore to mysore");
	driver.findElement(By.xpath("//button[@id='searchbox-searchbutton']")).click();
	
}
}