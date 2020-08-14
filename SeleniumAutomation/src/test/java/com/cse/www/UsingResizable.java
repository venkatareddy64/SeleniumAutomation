package com.cse.www;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingResizable 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("https://jqueryui.com/resizable/");
	      driver.switchTo().frame(0);
	    WebElement resize= driver.findElement(By.xpath("//*[@id=\'resizable\']/div[3]"));
	    Actions a=new Actions(driver);
	    a.clickAndHold(resize).moveByOffset(100, 100).perform();
	    }

}
