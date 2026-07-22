package com.WebDriver.Comments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserURLexercise {

    String expectedURL = "https://docs.langchain.com/";

    @Test(priority = 0)
    public void ChromeBrowserTest() {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://docs.langchain.com/");
        driver.manage().window().maximize();

        String actualURL = driver.getCurrentUrl();

        System.out.println("Chrome Browser URL: " + actualURL);

        if (expectedURL.equals(actualURL)) {
            System.out.println("Chrome Browser URL Test Case Passed");
        } else {
            System.out.println("Chrome Browser URL Test Case Failed");
            System.out.println("Expected URL: " + expectedURL);
            System.out.println("Actual URL  : " + actualURL);
            Assert.fail("URL Mismatch");
        }

        driver.quit();
    }

    @Test(priority = 1)
    public void FirefoxBrowserTest() {

        FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://docs.langchain.com/");
        driver.manage().window().maximize();

        String actualURL = driver.getCurrentUrl();

        System.out.println("Firefox Browser URL: " + actualURL);

        if (expectedURL.equals(actualURL)) {
            System.out.println("Firefox Browser URL Test Case Passed");
        } else {
            System.out.println("Firefox Browser URL Test Case Failed");
            System.out.println("Expected URL: " + expectedURL);
            System.out.println("Actual URL  : " + actualURL);
            Assert.fail("URL Mismatch");
        }

        driver.quit();
    }

    @Test(priority = 2)
    public void EdgeBrowserTest() {

        EdgeDriver driver = new EdgeDriver();

        driver.get("https://docs.langchain.com/");
        driver.manage().window().maximize();

        String actualURL = driver.getCurrentUrl();

        System.out.println("Edge Browser URL: " + actualURL);

        if (expectedURL.equals(actualURL)) {
            System.out.println("Edge Browser URL Test Case Passed");
        } else {
            System.out.println("Edge Browser URL Test Case Failed");
            System.out.println("Expected URL: " + expectedURL);
            System.out.println("Actual URL  : " + actualURL);
            Assert.fail("URL Mismatch");
        }

        driver.quit();
    }
}