package pomtests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenProductCatSearch
{
@Test(dataProvider="ebaydata")
public void ebayTest(String ddValue,String txtValue)
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://ebay.com");
	WebElement wb=driver.findElement(By.id("gh-cat"));
	Select s=new Select(wb);
	s.selectByVisibleText(ddValue);
	WebElement txt=driver.findElement(By.id("gh-ac"));
	txt.clear();
			txt.sendKeys(txtValue);
	driver.findElement(By.id("gh-btn")).click();
}
@DataProvider
public Object[][] ebaydata() throws Exception
{
	Object[][] data=null;
	  
	  XSSFWorkbook wb=new XSSFWorkbook(System.getProperty("user.dir") + "//TestData//DataDriven.xlsx");
	  XSSFSheet ws=wb.getSheet("Sheet1");
	  int rows=ws.getPhysicalNumberOfRows();
	  
	  data=new Object[rows][2];
	  
	  for(int i=0;i<rows;i++)
	  {
		  data[i][0]=ws.getRow(i).getCell(0).getStringCellValue();
		  data[i][1]=ws.getRow(i).getCell(1).getStringCellValue();
	  }
	  return data;
}
}