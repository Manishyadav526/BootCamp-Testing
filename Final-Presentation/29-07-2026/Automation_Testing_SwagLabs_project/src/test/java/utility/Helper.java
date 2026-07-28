package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helper {

	public static WebDriver startBrowser(String browser) throws InterruptedException {

	    WebDriver driver = null;

	    if (browser.equalsIgnoreCase("Chrome")
	            || browser.equalsIgnoreCase("GC")
	            || browser.equalsIgnoreCase("Google Chrome")) {

	        driver = new ChromeDriver();
	    }

	    else if (browser.equalsIgnoreCase("Edge")
	            || browser.equalsIgnoreCase("EG")
	            || browser.equalsIgnoreCase("Microsoft Edge")) {

	        driver = new EdgeDriver();
	    }

	    else if (browser.equalsIgnoreCase("Firefox")
	            || browser.equalsIgnoreCase("MF")
	            || browser.equalsIgnoreCase("Mozilla Firefox")) {

	        driver = new FirefoxDriver();
	    }

	    else {
	        System.out.println("Sorry! Unsupported Browser");
	        return null;
	    }

	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.get(ConfigReader.getProperty("url"));

	    return driver;
	}

    public static void closeBrowser(WebDriver driver) {

        if (driver != null) {
            driver.quit();
        }
    }
}