package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
@FindBy(id="email")
private WebElement unametbox;
@FindBy(xpath="//input[@id='pass']")
private WebElement pwdtbox;
@FindBy(xpath="//button[@name='login']")
private WebElement loginbtn;

public Loginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void username(String  un)
{
	unametbox.sendKeys(un);
}
public void password(String  pwd)
{
	pwdtbox.sendKeys(pwd);
}
public void clicklogin()
{
	loginbtn.click();
}


}
