package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pompages.BrowserFactory;

public class DragAndDrop {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=BrowserFactory.startBrowser("Chrome", "https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.xpath("//*[@id=\'draggable\']"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\'droppable\']"));
		Actions a=new Actions(driver);
		a.contextClick(drag);
		a.dragAndDrop(drag,drop).perform();
		Thread.sleep(3000);
		//a.doubleClick(drop);
		//Thread.sleep(3000);

	}

}
