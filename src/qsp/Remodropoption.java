package qsp;


	import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Remodropoption {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./Scripts/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("file:///C:/Users/Lenovo/Desktop/dropdown.html");
			Thread.sleep(1000);
			WebElement ele=driver.findElement(By.id("Orion"));
			Select s=new Select(ele);
			List<WebElement> options = s.getOptions();
			int count=options.size();
			System.out.println(count);
			ArrayList<String> l=new ArrayList<String>();
			for(WebElement we:options)
			{
				String text=we.getText();
				l.add(text);
				l.remove("Westside");
	}
			Collections.sort(l);
			for(String t:l)
			{
				System.out.println(t);
			}
		}
	}
