package pomobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClsAmazon
{
public WebDriver driver;
public void ClsAmazon(WebDriver d)
{
	driver=d;
}
By signin=By.xpath("//*[@id=\'nav-flyout-ya-signin\']/a/span");
By username=By.xpath("//*[@id=\'ap_email\']");
By con=By.xpath("//*[@id=\'continue\']");
By pass=By.xpath("//*[@id=\'ap_password\']");
By login=By.xpath("//*[@id=\'signInSubmit\']");
public void clickSignIn()
{
	driver.findElement(signin).click();
	
}
public void setTextUsername(String uname)
{
	driver.findElement(username).sendKeys(uname);
}
public void clickContinue()
{
	driver.findElement(con).click();
}
public void setTextPassword(String pwd)
{
	driver.findElement(pass).sendKeys(pwd);
}
public void clickLogin() 
{
 driver.findElement(login).click();	
}
}
