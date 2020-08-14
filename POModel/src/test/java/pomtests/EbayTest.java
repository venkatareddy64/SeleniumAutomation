package pomtests;

import org.openqa.selenium.WebDriver;

import pompages.BrowserFactory;
import pompages.ClsEbay;

public class EbayTest {

	public static void main(String[] args) {

		WebDriver driver=BrowserFactory.startBrowser("Firefox", "http://ebay.com");
		ClsEbay c=new ClsEbay(driver);
		c.fnCatSearch("Baby");
		c.fnProdSearch("toys");
		c.fnSearch();
	}

}
