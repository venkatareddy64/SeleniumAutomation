package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobject.ClsEbay;

public class Step {
	public WebDriver driver;
	ClsEbay obj;

@Given("user launch chrome browser")
public void user_launch_chrome_browser() {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	obj=new ClsEbay(driver);
	
   
}

@When("user opens url {string}")
public void user_opens_url(String url) {
	driver.get(url);
    
}

@When("user select the dropdown as {string}")
public void user_select_the_dropdown_as(String cat) {
	obj.selectDropDown(cat);
  
}

@When("user enter text as {string}")
public void user_enter_text_as(String pName) {
	obj.prodtext(pName);
	}

@When("user click on search button")
public void user_click_on_search_button() {
	obj.searching();
    }

@Then("Page url should be {string}")
public void page_url_should_be(String exp) {
	String act=driver.getCurrentUrl();
	Assert.assertEquals(exp, act);
    }



}
