package com.pack;


import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class ImageComaprision1
{
	
  public static void main(String args[]) throws Exception 
	{
	 
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	     WebElement logoImageElement=driver.findElement(By.xpath("//*[@id=\'divLogo\']/img"));
          Screenshot logoImageScreenshot=new AShot().takeScreenshot(driver,logoImageElement);
         ImageIO.write(logoImageScreenshot.getImage(),"png",new File("D://orange.png"));
		File f=new File("D://orange.png");
		if(f.exists())
		{
			System.out.println("image file captured");
		}
		else
			System.out.println("image file is not captured");
	}

}
