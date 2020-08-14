package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ClsEbay
{
	public WebDriver driver;
	By ddValue=By.id("gh-cat");
    By txtValue=By.id("gh-ac");
	By search=By.id("gh-btn");
	
	public ClsEbay(WebDriver d)
	{
		driver=d;
	}
	public void selectDropDown(String cat)
	{
		WebElement wb=driver.findElement(ddValue);
		Select s=new Select(wb);
		s.selectByVisibleText(cat);
	}
	public void prodtext(String pName)
	{
		driver.findElement(txtValue).sendKeys(pName);
	}
	public void searching()
	{
		driver.findElement(search).click();
	}

}
