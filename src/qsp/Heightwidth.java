package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heightwidth {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Scripts/chromedriver.exe");	
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.google.com/");
				WebElement ele =driver.findElement(By.xpath("//input[@type='text']"));
				int height=ele.getSize().getHeight();
				System.out.println(height);
				int width=ele.getSize().getWidth();
				System.out.println(width);

}
}
