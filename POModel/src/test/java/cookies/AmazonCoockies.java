package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonCoockies {

	public static void main(String[] args)
	{
       System.getProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
	    driver.manage().window().maximize();
        driver.get("http://amazon.in");
        Set<Cookie>c=driver.manage().getCookies();
        //print size of the cookies
        System.out.println("Size of the coockies:"+c.size());
        /*for(Cookie cs:c)
        {
	     //print name of the cookie and value of the cookie
	     System.out.println(cs.getName()+":"+cs.getValue());
	    }*/
        //System.out.println(driver.manage().getCookieNamed("session-id-time"));
        Cookie obj=new Cookie("mycookie123","123456");
        driver.manage().addCookie(obj);
        driver.manage().deleteAllCookies();
        c=driver.manage().getCookies();
        System.out.println("size of the cookie:"+c.size());
        for(Cookie cs:c)
        {
	     //print name of the cookie and value of the cookie
     	System.out.println(cs.getName()+":"+cs.getValue());
        }
	}
}
