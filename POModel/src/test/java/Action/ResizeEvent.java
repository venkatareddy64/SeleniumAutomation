package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import pompages.BrowserFactory;

public class ResizeEvent {

	public static void main(String[] args) throws Exception 
	{
     WebDriver driver=BrowserFactory.startBrowser("Chrome","https://jqueryui.com/resizable/");
     Actions a=new Actions(driver);

     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.switchTo().frame(0);
     WebElement drag=driver.findElement(By.xpath("//*[@id=\'resizable\']/div[3]"));
     Thread.sleep(3000);
     a.clickAndHold(drag).moveByOffset(100, 30).release(drag).build().perform();
     Thread.sleep(3000);
     Reporter.log("Resizable Test Completed",true);
	}

}
