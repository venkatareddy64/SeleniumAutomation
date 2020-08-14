package com.cse.www;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTable 
{
    public static void main(String[] args)
{
 System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the country :");
 String company=sc.nextLine();
 String country=null;
 boolean isAvail=true;
 driver.get("https://www.w3schools.com/html/html_tables.asp");
int r= driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr")).size();
System.out.println(r);
int c=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[1]/th")).size();
System.out.println(c);
for(int i=2;i<=r;i++)
{
	for(int j=1;j<=c;j++)
	{
	WebElement cell=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]/td[1]"));
	if(cell.getText().equalsIgnoreCase(company))
	{
		isAvail=false;
		country=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]/td[3]")).getText();
		break;
	}
	}
	if(isAvail==false)
	{
		System.out.println("'"+company+"company is available in the country:"+country);
		
	}
	else
	{
		System.out.println("'"+company+"company is not available in the country:"+country);

	}
	driver.close();
}

	}

}
