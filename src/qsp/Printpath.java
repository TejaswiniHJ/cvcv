package qsp;



	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Printpath {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./Scripts/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			List<WebElement> images =driver.findElements(By.xpath("//img"));
			for(WebElement we:images)
			{
				String text=we.getAttribute("src");
				System.out.println(text);
				
			}
}
	}
