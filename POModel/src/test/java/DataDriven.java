import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DataDriven {
  @Test
  public void driventest() throws Exception
  
 {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://ebay.com");
	  XSSFWorkbook wb=new XSSFWorkbook("D:\\SeleniumCode\\POModel\\TestData\\DataDriven.xlsx");
	  XSSFSheet sheet=wb.getSheet("sheet1");
	  int rows=sheet.getPhysicalNumberOfRows();
	  for(int i=1;i<=rows;i++)
	  {
		    String ddValue=sheet.getRow(i).getCell(0).getStringCellValue();
			String txtValue=sheet.getRow(i).getCell(1).getStringCellValue();
			
			WebElement dd=driver.findElement(By.id("gh-cat"));
			Select s=new Select(dd);
			s.selectByVisibleText(ddValue);
			
			WebElement txt=driver.findElement(By.id("gh-ac"));
			txt.clear();
			txt.sendKeys(txtValue);
			
			driver.findElement(By.id("gh-btn")).click();
		}
	}

}













