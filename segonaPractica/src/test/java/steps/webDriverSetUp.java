package steps;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class webDriverSetUp {
	
	private static webDriverSetUp instance;
	private static WebDriver driver;
	private static WebDriverWait wait;
	
	
	
    public webDriverSetUp() {
    	System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
    	
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
    }
	
	public static WebDriver getDriver() {
        if (instance == null) {
            instance = new webDriverSetUp();
        }
        return driver;
    }
	
	public static WebDriverWait getWait() {
        if (instance == null) {
        	instance = new webDriverSetUp();
        }
        return wait;
    }
	
	public static void closeDriver() {
        if (instance != null) {
        	driver.close();
            instance = null;
        }
    }
}