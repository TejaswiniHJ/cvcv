package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
public static void main(String[] args) {
	String key="webdriver.gecko.driver";//indicates specific type of browser
	String value="./Scripts/geckodriver.exe";//path of driver executable file
	System.setProperty(key, value);
	FirefoxDriver dri=new FirefoxDriver();
}
}
