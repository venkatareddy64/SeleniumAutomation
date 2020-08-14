package Action;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) throws Exception
	{
      WebDriver driver=new ChromeDriver();
      driver.get("https://jqueryui.com/selectable/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.switchTo().frame(0);
  WebElement lbox=driver.findElement(By.id("selectable"));
     List<WebElement> item=lbox.findElements(By.tagName("li"));
      Actions a=new Actions(driver);
      Thread.sleep(3000);
      a.keyDown(Keys.CONTROL).click(item.get(1)).click(item.get(2));
	}

}
