package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pompages.BrowserFactory;

public class DragAndHoldDrop {

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver=BrowserFactory.startBrowser("Chrome", "https://jqueryui.com/droppable/");
      Actions a=new Actions(driver);

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.switchTo().frame(0);
     WebElement drag=driver.findElement(By.xpath("//*[@id=\'draggable\']"));
     WebElement drop=driver.findElement(By.xpath("//*[@id=\'droppable\']"));
     a.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
     Thread.sleep(3000);
	}

}
