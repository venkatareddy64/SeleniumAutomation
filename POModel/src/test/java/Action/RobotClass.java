package Action;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClass {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
	driver.get("https://transfer.pcloud.com/");
      StringSelection str=new StringSelection("C:\\Users\\susmitha\\Pictures\\swathi\\swami.jpg");
      Toolkit.getDefaultToolkit().getDefaultToolkit().getSystemClipboard().setContents(str, null);
      driver.findElement(By.cssSelector("#upload-form > div > div.left_box > div > div.top-holder > div.add_files_btn > a > span > span"
    		  )).click();
      Robot robot=new Robot();
      robot.keyPress(KeyEvent.VK_CONTROL);
      robot.keyPress(KeyEvent.VK_V);
      robot.keyRelease(KeyEvent.VK_V);
      robot.keyRelease(KeyEvent.VK_CONTROL);
      Thread.sleep(3000);
      robot.keyPress(KeyEvent.VK_ENTER);
      robot.keyRelease(KeyEvent.VK_ENTER);
      
      
	}

}
