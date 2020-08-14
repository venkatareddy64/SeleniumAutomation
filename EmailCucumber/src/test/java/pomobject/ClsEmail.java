package pomobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ClsEmail {
	public static  WebDriver driver;

	public ClsEmail(WebDriver d)
	{
		driver=d;
	}
	By ddValue=By.id("gh-cat");
	By txtValue=By.id("gh-ac");
	By search=By.id("gh-btn");
	public void selectDropDown(String cat)
	{
       WebElement wb=driver.findElement(ddValue);
       Select s=new Select(wb);
       s.selectByVisibleText(cat);
	}
	public void productNameInText(String pName)
	{
		driver.findElement(txtValue).sendKeys(pName);
	}
	public void search()
	{
		driver.findElement(search).click();
	}
}