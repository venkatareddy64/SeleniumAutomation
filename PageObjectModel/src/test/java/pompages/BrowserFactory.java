package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
  public static WebDriver driver;
  public static WebDriver startBrowser(String bName,String url)
  {
	  if(bName.equalsIgnoreCase("Chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  
	  }
	  else
		  if(bName.equalsIgnoreCase("Firefx"))
		  {
			  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
			  driver=new ChromeDriver();
			  
		  }
	  driver.manage().window().maximize();
	  driver.get(url);
	  return driver;
	 
  }
}
