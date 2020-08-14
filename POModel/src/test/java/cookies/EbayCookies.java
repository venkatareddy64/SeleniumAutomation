package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayCookies {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		Set<Cookie>cookie=driver.manage().getCookies();
		System.out.println("Size of the cookies:"+cookie.size());
		for(Cookie cookies:cookie)
		{
			System.out.println(cookies.getName()+":"+cookies.getValue());
		}
		Cookie cobj=new Cookie("mycookie123","1234");
		driver.manage().addCookie(cobj);
		cookie=driver.manage().getCookies();
		System.out.println(cookie.size());
		for(Cookie cookies:cookie)
		{
			System.out.println(cookies.getName()+":"+cookies.getValue());
		}
		driver.manage().deleteCookie(cobj);
		cookie=driver.manage().getCookies();
		System.out.println("Size of the cookies:"+cookie.size());
		driver.manage().deleteAllCookies();
		cookie=driver.manage().getCookies();
		System.out.println("Size of the cookies:"+cookie.size());
		
				
		
		
	}

}
