package qsp;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

	public class Rightclick {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./Scripts/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.google.com/");
			Thread.sleep(1000);
			WebElement ele=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
			Actions act=new Actions(driver);
			act.contextClick(ele).perform();
}
}
