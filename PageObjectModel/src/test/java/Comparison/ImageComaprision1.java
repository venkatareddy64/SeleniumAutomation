package Comparison;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class ImageComaprision1
{
	@Test
  public void test() throws Exception 
	{
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	    /* WebElement logoImage=driver.findElement(By.xpath("//*[@id=\'divLogo\']/img"));
          Screenshot screenshot=new AShot().takeScreenshot(driver,logoImage);
         ImageIO.write(screenshot.getImage(),"png",new File("D://orange.png"));
		File f=new File("D://orange.png");
		if(f.exists())
		{
			System.out.println("image file captured");
		}
		else
			System.out.println("image file is not captured");*/
	}

}
