package pomtests;

import org.openqa.selenium.WebDriver;

import pompages.BrowserFactory;

public class Basic {

	public static void main(String[] args) {
    WebDriver driver=BrowserFactory.startBrowser("Firefox", "http://amazon.in");
	}

}
