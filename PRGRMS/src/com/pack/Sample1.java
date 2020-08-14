package com.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		System.out.println("Welcome, Venkatreddy");

	}

}
