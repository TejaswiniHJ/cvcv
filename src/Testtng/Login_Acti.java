package Testtng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login_Acti extends Generic_test{
	@Test
	public void validlogin() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='login']")).click();
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
		
	}

}
