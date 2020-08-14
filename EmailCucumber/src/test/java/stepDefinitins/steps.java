package stepDefinitins;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pomobject.ClsEmail;

public class steps
{
	public WebDriver driver;
	ClsEmail cls;


	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
	 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		    driver=new ChromeDriver();
    cls=new ClsEmail(driver);
}

@When("user open the url as {string}")
public void user_open_the_url_as(String url) {
	driver.get(url);
   
}
@When("user select the dropdown as {string}")
public void user_select_the_dropdown_as(String cat) {
	cls.selectDropDown(cat);
    }


@When("user enter text fiels as {string}")
public void user_enter_text_fiels_as(String pName) {
	cls.productNameInText(pName);
   
}

@When("user click the search button")
public void user_click_the_search_button()
{
	cls.search();
	}

@Then("the page should be {string}")
public void the_page_should_be(String ep) 
{
	String actual=driver.getCurrentUrl();
	Assert.assertEquals(ep,actual);
   
}


}
