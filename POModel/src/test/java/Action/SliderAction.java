package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderAction {

	public static void main(String[] args) throws Exception
	{
      WebDriver driver=new ChromeDriver();
      driver.get("https://jqueryui.com/slider/#colorpicker");
      Actions a=new Actions(driver);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.switchTo().frame(0);
      WebElement slider=driver.findElement(By.xpath("//*[@id='green']/span"));
      a.clickAndHold(slider).moveByOffset(100, 0).release(slider).build().perform();
      Thread.sleep(3000);
	}

}
