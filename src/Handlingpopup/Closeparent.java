package Handlingpopup;



	import java.awt.AWTException;
    import java.util.Set;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Closeparent {

		public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.chrome.driver","./Scripts/chromedriver.exe");	
					WebDriver driver=new ChromeDriver();
					driver.get("https://www.naukri.com/");
					Thread.sleep(1000);
					String parent_id = driver.getWindowHandle();
					Set<String> allwh = driver.getWindowHandles();
				
					for(String wh:allwh)
					{
						driver.switchTo().window(wh);
						String title = driver.getTitle();
						System.out.println(title);
						Thread.sleep(1000);
						if(wh.equals(parent_id))
						{
						driver.close();
					}
		}
		}
	}
					

