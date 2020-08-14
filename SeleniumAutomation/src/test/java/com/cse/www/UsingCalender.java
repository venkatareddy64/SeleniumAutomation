package com.cse.www;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingCalender 
{

	public static void main(String[] args) throws Exception 
	{
   //    System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.get("http://redbus.in");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\'search\']/div/div[3]/span")).click();
     String alert =driver.switchTo().alert().getText();
     System.out.println(alert);
     driver.switchTo().alert().accept();
	}
}

     