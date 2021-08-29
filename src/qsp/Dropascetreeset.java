package qsp;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
    import java.util.TreeSet;

import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.support.ui.Select;

		public class Dropascetreeset {
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
				TreeSet<String> t=new TreeSet<String>();
				
				for(WebElement we:options)
				{
					String text=we.getText();
					t.add(text);
				}
				
				for(String t1:t)
					System.out.println(t1);
					
}
		}
