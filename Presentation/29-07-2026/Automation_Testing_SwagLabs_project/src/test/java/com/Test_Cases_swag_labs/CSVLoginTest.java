package com.Test_Cases_swag_labs;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.CSVHelper;
import utility.ConfigReader;
import utility.Helper;
import utility.ScreenshotHelper;

public class CSVLoginTest {

    private static final String csvPath = "CSVFiles/SwagLabs_Valid_Login_Users.csv";

    @Test
    public void DDTLoginTest() throws Exception {

        CSVHelper csv = new CSVHelper(csvPath);

        String[] csvCell;

        // Launch Browser
        WebDriver driver = Helper.startBrowser(ConfigReader.getProperty("browser"));
        LoginPage loginPage = new LoginPage(driver);

        int total = 0;
        int passed = 0;
        int failed = 0;

        System.out.println("\n==============================================");
        System.out.println("      SWAG LABS LOGIN TEST RESULTS");
        System.out.println("==============================================");

        while ((csvCell = csv.getNextRow()) != null) {

            total++;

            String testCaseId = csvCell[0];
            String username = csvCell[1];
            String password = csvCell[2];

            Thread.sleep(4000);

            loginPage.login(username, password);

            Thread.sleep(2000);

            if (loginPage.isLoginSuccessful()) {

                System.out.println(testCaseId + " | " + username + " --> PASS");
                passed++;

            } else {

                System.out.println(testCaseId + " | " + username + " --> FAIL");
                failed++;

            }

            ScreenshotHelper.captureScreenshot(driver, testCaseId);

            // Return to Login Page
            driver.get(ConfigReader.getProperty("url"));
        }

        System.out.println("--------------------------------------------");
        System.out.println("Total Test Cases : " + total);
        System.out.println("Passed           : " + passed);
        System.out.println("Failed           : " + failed);

        Helper.closeBrowser(driver);
        csv.closeCSV();
    }
}