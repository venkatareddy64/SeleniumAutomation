package Action;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruUploadFile {

	public static void main(String[] args) throws IOException
	{
		System.getProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://transfer.pcloud.com/");
	    driver.findElement(By.xpath("//*[@id=\'upload-form\']/div/div[2]/div/div[1]/div[2]/a/span/span")).click();
        Runtime.getRuntime().exec("Desktop\\upload.au3");
	}

}
