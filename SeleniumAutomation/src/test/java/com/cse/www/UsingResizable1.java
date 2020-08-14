package com.cse.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingResizable1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
	      WebDriver driver=new FirefoxDriver();
	      driver.get("https://jqueryui.com/slider/#rangemin");
	      driver.switchTo().frame(0);
	      WebElement slider=driver.findElement(By.xpath("//*[@id=\'slider-range-min\']/span"));
	      Actions a=new Actions(driver);
	      a.clickAndHold(slider).moveToElement(slider, 200,0).release().perform();
	    
	}

}
