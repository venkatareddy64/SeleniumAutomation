package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMenu {

	public static void main(String[] args) {
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://jqueryui.com/selectmenu/");
	      Select s=new Select(driver.findElement(By.id("speed-button")));
	      s.deselectByIndex(3);
	     
	}

}
