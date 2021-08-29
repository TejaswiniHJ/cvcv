package qsp;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Demo12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Scripts/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("tejuhj@gmail.com");
		driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("teju");
		driver.findElement(By.xpath("//span[@class='VfPpkd-RLmnJb']")).click();
	}
	}

