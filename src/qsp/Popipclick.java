package qsp;


	import java.awt.AWTException;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Popipclick {

		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.gecko.driver","./Scripts/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("http://demo.guru99.com/test/delete_customer.php");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("teju");
			 Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Alert a=driver.switchTo().alert();
			String text = a.getText();
			System.out.println(text);
			a.accept();
	        Thread.sleep(2000);
	        a.accept();
	}
	}
