package keyworddriven;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonKeywordDrivenFramework
{
	public WebDriver driver;
	@Test
	public void myTest() throws Exception
	{
		XSSFWorkbook wb=new XSSFWorkbook(System.getProperty("user.dir")+"//TestData//Akeywords.xlsx");
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int rows=sheet.getPhysicalNumberOfRows();
		for(int i=1;i<=rows;i++)
		{
			Thread.sleep(3000);
			String cTestcase=sheet.getRow(i).getCell(0).getStringCellValue();
			String cLocType=sheet.getRow(i).getCell(1).getStringCellValue();

			String cLocValue=sheet.getRow(i).getCell(2).getStringCellValue();

			String cTestData=sheet.getRow(i).getCell(3).getStringCellValue();
			switch(cTestcase)
			{
			case "open_Browser":if(cTestData.equalsIgnoreCase("Chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			else
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
			driver.manage().window().maximize();
			break;
			case "enter_Url":
				driver.get(cTestData);
				Thread.sleep(3000);
				break;
			case "enter_Text":
				WebElement txt=driver.findElement(LocatorInto(cLocType,cLocValue));
				txt.sendKeys(cTestData);
				break;
			case "click_Button":
				WebElement click=driver.findElement(LocatorInto(cLocType,cLocValue));
				click.click();
				break;
				
			}

		}
	}
	@Test
	public By LocatorInto(String lType,String lValue)
	{
	By b=null;

switch(lType)
{
	  case "id":
		  b=By.id(lValue);
		  break;
	  case "name":
		  b=By.name(lValue);
		  break;
	  case "class":
		  b=By.className(lValue);
		  break;
	  case "xpath":
		  b=By.xpath(lValue);
		  break;
	  case "cssSelector":
		  b=By.cssSelector(lValue);
		  break;
	  case "tagName":
		  b=By.tagName(lValue);
		  break;
	  case "linkText":
		  b=By.linkText(lValue);
		  break;
	  case "partialLinkText":
		  b=By.partialLinkText(lValue);
		  break;
}

return b;
}
}













