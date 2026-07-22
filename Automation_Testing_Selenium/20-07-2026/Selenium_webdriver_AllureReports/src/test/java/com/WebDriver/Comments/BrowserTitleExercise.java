package com.WebDriver.Comments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserTitleExercise {

    String expectedTitle = "Home - Docs by LangChain";

    @Test(priority = 0)
    public void ChromeBrowserTest() {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://docs.langchain.com/");
        driver.manage().window().maximize();

        String actualTitle = driver.getTitle();

        System.out.println("Chrome Browser Title: " + actualTitle);

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Chrome Browser Test Case Passed");
        } else {
            System.out.println("Chrome Browser Test Case Failed");
            System.out.println("Expected Title: " + expectedTitle);
            System.out.println("Actual Title  : " + actualTitle);
            Assert.fail("Title Mismatch");
        }

        driver.quit();
    }

    @Test(priority = 1)
    public void FirefoxBrowserTest() {

        FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://docs.langchain.com/");
        driver.manage().window().maximize();

        String actualTitle = driver.getTitle();

        System.out.println("Firefox Browser Title: " + actualTitle);

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Firefox Browser Test Case Passed");
        } else {
            System.out.println("Firefox Browser Test Case Failed");
            System.out.println("Expected Title: " + expectedTitle);
            System.out.println("Actual Title  : " + actualTitle);
            Assert.fail("Title Mismatch");
        }

        driver.quit();
    }

    @Test(priority = 2)
    public void EdgeBrowserTest() {

        EdgeDriver driver = new EdgeDriver();

        driver.get("https://docs.langchain.com/");
        driver.manage().window().maximize();

        String actualTitle = driver.getTitle();

        System.out.println("Edge Browser Title: " + actualTitle);

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Edge Browser Test Case Passed");
        } else {
            System.out.println("Edge Browser Test Case Failed");
            System.out.println("Expected Title: " + expectedTitle);
            System.out.println("Actual Title  : " + actualTitle);
            Assert.fail("Title Mismatch");
        }

        driver.quit();
    }
}