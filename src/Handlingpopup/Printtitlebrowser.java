package Handlingpopup;


	import java.awt.AWTException;
    import java.util.Set;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Printtitlebrowser {

		public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.chrome.driver","./Scripts/chromedriver.exe");	
					WebDriver driver=new ChromeDriver();
					driver.get("https://www.naukri.com/");
					Thread.sleep(1000);
					Set<String> allwh = driver.getWindowHandles();
					
					for(String wh:allwh)
					{
						driver.switchTo().window(wh);
						String title = driver.getTitle();
						System.out.println(title);
						Thread.sleep(1000);
						driver.close();
					}
		}
					
}
