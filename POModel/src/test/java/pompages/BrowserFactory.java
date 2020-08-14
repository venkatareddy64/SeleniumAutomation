package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory
{
public static WebDriver wb;
public static WebDriver startBrowser(String bName,String url)
{
	if(bName.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		wb=new ChromeDriver();
	}
	else
	if(bName.equalsIgnoreCase("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		wb=new FirefoxDriver();
	}
	wb.manage().window().maximize();
	wb.get(url);
	return wb;

}
	
}
