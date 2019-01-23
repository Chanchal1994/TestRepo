package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStack {
	
	public static final String USERNAME = "chanchal14";
	  public static final String AUTOMATE_KEY = "TtvWf4jd4iehF151ktDS";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  public static void main(String[] args) throws Exception {

		  System.setProperty("webdriver.chrome.driver", "D:\\Chanchal\\chromedriver.exe");
		  new DesiredCapabilities();
		  DesiredCapabilities caps = DesiredCapabilities.safari();
		  caps.setPlatform(Platform.XP);
		  caps.setPlatform(Platform.MAC);
		  
		  
	   // DesiredCapabilities caps = new DesiredCapabilities();
	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
//	    caps.setCapability("browser", "Chrome");
//	    caps.setCapability("browser_version", "62.0");
//	    caps.setCapability("os", "Android");
//	    caps.setCapability("os_version", "10");
//	    caps.setCapability("resolution", "1024x768");		
	
		
	    
	    driver.get("https://google.com");
	    WebElement element = driver.findElement(By.name("q"));

	    element.sendKeys("BrowserStack");
	    element.submit();

	    System.out.println(driver.getTitle());
	    driver.quit();

}
}
