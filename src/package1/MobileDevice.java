package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MobileDevice {

	
	public static final String USERNAME = "chanchal14";
	  public static final String AUTOMATE_KEY = "TtvWf4jd4iehF151ktDS";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  public static void main(String[] args) throws Exception {

	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browserName", "iPhone");
	    caps.setCapability("device", "iPhone 8 Plus");
	    caps.setCapability("realMobile", "true");
	    caps.setCapability("os_version", "11.0");
	    caps.setCapability("browserstack.debug", "true");

	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	    driver.get("http://expressions-staging.streammarket.co.uk/webpos");
	    WebElement element = driver.findElement(By.name("q"));
	    element.sendKeys("BrowserStack");
	    element.submit();

	    System.out.println(driver.getTitle());
	    driver.quit();
		  
		  
		  
	  }
}
