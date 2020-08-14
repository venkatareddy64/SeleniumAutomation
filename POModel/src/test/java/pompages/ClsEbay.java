package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ClsEbay 
{
public WebDriver driver;
public ClsEbay(WebDriver d)
{
	driver=d;
}
By ddCat=By.id("gh-cat");
By txtValue=By.id("gh-ac");
By subbtn=By.id("gh-btn");
public void fnCatSearch(String cat)
{
	WebElement wb=driver.findElement(ddCat);
	Select s=new Select(wb);
	s.selectByVisibleText(cat);
	
}
public void fnProdSearch(String pName)
{
	driver.findElement(txtValue).sendKeys(pName);
}
public void fnSearch()
{
	driver.findElement(subbtn).click();
}
}
