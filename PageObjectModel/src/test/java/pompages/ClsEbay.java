package pompages;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ClsEbay 
{
	

	
	
	 public WebDriver driver;
	public ClsEbay(WebDriver d)
	{
		driver=d;
		
		
	}
	By catsearch=By.id("gh-cat");
	By txtsearch=By.id("gh-ac");
	By subbutton=By.id("gh-btn");
	public void setCatSearch(String cat)
	{
		WebElement wb=driver.findElement(catsearch);
		Select s=new Select(wb);
		s.selectByVisibleText(cat);
		
	}
	public void textElement(String pName)
	{
		driver.findElement(txtsearch).sendKeys(pName);
	}
	public void searchbtn()
	{
		driver.findElement(subbutton).click();
	}
	

}
