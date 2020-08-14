package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Spiceject {
  
  public WebDriver driver;
  @Test(priority='1')
  public void booking() throws InterruptedException {
	  System.getProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://spicejet.com");
	  driver.findElement(By.id("divpaxinfo")).click();
	  Thread.sleep(3000);
	  WebElement wb=driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
	  Select s=new Select(wb);
      s.selectByValue("3");
     System.out.println( driver.findElement(By.id("divpaxinfo")).getText());
  }
  @Test(priority='2')
  public void datepicker()
  {
	 driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_view_date1\']")).click(); 
   List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\'ui-datepicker-div\']/div[1]/table/tbody/tr"));
  for(int i=3;i<=rows.size();i++)
  {
	  List<WebElement>colms=driver.findElements(By.xpath("//*[@id=\'ui-datepicker-div\']/div[1]/table/tbody/tr["+i+"]/td"));
	  for(int j=1;j<=colms.size();j++)
	  {
		  WebElement cell=driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div[1]/table/tbody/tr["+i+"]/td["+j+"]"));
		  if(cell.getText().equalsIgnoreCase("25"))
		  {
			  cell.click();
		  }
	  }
  }
  }
}