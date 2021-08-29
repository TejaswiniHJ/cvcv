package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pom.Loginpage;

public class Pom_concept {
@Test
public void hello() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "./Scripts/geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://en-gb.facebook.com/");
	Loginpage lp=new Loginpage(driver);
	lp.username("tejuhj@gmail.com");
	Thread.sleep(2000);
	lp.password("Saitej@1994");
	Thread.sleep(2000);
	lp.clicklogin();
}
}
