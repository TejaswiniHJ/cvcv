package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.gecko.driver";//indicates specific type of browser
		String value="./Scripts/geckodriver.exe";//path of driver executable file
		System.setProperty(key, value);
		FirefoxDriver dri=new FirefoxDriver();
		Thread.sleep(3000);
		dri.close();
		dri.quit();
	}
	}


