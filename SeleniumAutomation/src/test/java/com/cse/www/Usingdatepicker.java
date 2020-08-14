package com.cse.www;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingdatepicker {

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\susmitha\\SeleniumJars\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://jqueryui.com/datepicker/");
	      driver.switchTo().frame(0);
	      driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	      int rows= driver.findElements(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr")).size();
	      System.out.println(rows);
	    for(int i=2;i<=rows;i++)
	    {
	    	List<WebElement>cols=driver.findElements(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr["+i+"]/td"));
	    	for(int j=1;j<=cols.size();j++)
	    	{
	    		WebElement cells=driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr["+i+"]/td["+j+"]"));
	    		if(cells.getText().equals("24"))
	    		{
	    			cells.click();
	    			break;
	    		}
	    	}

	    }
	    

	}

}
