package pomtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pompages.ClsEbay;
import pompages.TestEbayData;

public class HybridDatadrivenFramework 
{
@Test(dataProvider="ebayData")
public  void ebayTest(String ddValue,String txtValue)
{
	//System.setProperty("webdriver.geckoss.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
	//WebDriver driver=BrowserFactory.startBrowser("Firefox", "http://ebay.com");
	WebDriver driver=new FirefoxDriver();
	ClsEbay c=new ClsEbay(driver);
	c.fnCatSearch(ddValue);
	c.fnProdSearch(txtValue);
	c.fnSearch();
}
@DataProvider
public Object[][] ebayData() throws Exception
{
 Object[][] data=TestEbayData.getExcelData(System.getProperty("user.dir")+"//TestData//DataDriven.xlsx");
 return data;
}
}
