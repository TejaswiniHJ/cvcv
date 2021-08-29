package Handlingpopup;



	import java.awt.AWTException;
    import java.util.Set;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Countofbrowserid {


		public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.chrome.driver","./Scripts/chromedriver.exe");	
					WebDriver driver=new ChromeDriver();
					driver.get("https://www.naukri.com/");
					Thread.sleep(1000);
					Set<String> allwh = driver.getWindowHandles();
					int count=allwh.size();
					System.out.println(count);
					for(String wh:allwh)
					{
						System.out.println(wh);
					}
					
					
	}
	}



