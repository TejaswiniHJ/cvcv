package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) {
		String key="webdriver.gecko.driver";//indicates specific type of browser
		String value="./Scripts/geckodriver.exe";//path of driver executable file
		System.setProperty(key, value);
		FirefoxDriver dri=new FirefoxDriver();


			String key1="webdriver.chrome.driver";
			String value1="./Scripts/chromedriver.exe";
			System.setProperty(key1,value1);
			ChromeDriver driver = new ChromeDriver();
		}
}
