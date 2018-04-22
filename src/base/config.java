package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.WebDriverFuncrions;

public class config extends WebDriverFuncrions {
	// do all the configuration
	// initiate the driver > setup Browser > Company URL > xyz
	
	
	
	@BeforeTest
	
public void initDrivers(){
	

	 
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://www.facebook.com");

	
	
}
}
