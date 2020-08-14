package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jet {

	public static void main(String[] args) throws InterruptedException {
		  System.getProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://spicejet.com");
		  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		  Thread.sleep(3000);
          driver.findElement(By.xpath("//a[@value='BLR']")).click();
          driver.findElement(By.xpath("//a[@value='MAA']")).click();

	}

}
