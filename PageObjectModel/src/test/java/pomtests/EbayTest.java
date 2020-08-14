package pomtests;

import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pompages.BrowserFactory;
import pompages.ClsEbay;

public class EbayTest {
	public static void main(String args[])
	
	 {
	 Logger logger=Logger.getLogger(EbayTest.class.getName());
	 PropertyConfigurator.configure("log4j.properties");
		WebDriver driver=BrowserFactory.startBrowser("Chrome", "http://ebay.com");
		ClsEbay c=new ClsEbay(driver);
		logger.info("selected catagory");
		c.setCatSearch("Baby");
		logger.info("enter the item t be text field");
		c.textElement("toys");
		logger.info("enter to search button");
		c.searchbtn();
		logger.info("exit running of application");
		
	}

}
