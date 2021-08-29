package qsp;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Links {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./Scripts/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Lenovo/Desktop/checkbox.html");
			List<WebElement> linkss = driver.findElements(By.tagName("input"));
			int count=linkss.size();
			System.out.println(count);
			for(WebElement we:linkss)
			{
				String text=we.getText();
				System.out.println(text);
				
}
		}
	}
