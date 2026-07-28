package com.Test_Cases_swag_labs;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.CheckoutPage;
import pages.InventoryPage;
import pages.LoginPage;
import utility.ConfigReader;
import utility.Helper;
import utility.ScreenshotHelper;

public class ProductPurchaseTest {

    @Test
    public void purchaseProduct() throws InterruptedException {

        // Launch Browser
        WebDriver driver = Helper.startBrowser(ConfigReader.getProperty("browser"));

        // Home Page
        ScreenshotHelper.captureScreenshot(driver, "HomePage");

        // Create Page Objects
        LoginPage loginPage = new LoginPage(driver);
        InventoryPage inventoryPage = new InventoryPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        // Login
        loginPage.login(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password")
        );
        Thread.sleep(5000);
        ScreenshotHelper.captureScreenshot(driver, "LoginSuccess");

        // Inventory
        inventoryPage.clickBackpack();
        Thread.sleep(5000);
        ScreenshotHelper.captureScreenshot(driver, "BackpackDetails");

        inventoryPage.addToCart();
        Thread.sleep(5000);
        ScreenshotHelper.captureScreenshot(driver, "BackpackAdded");

        inventoryPage.backToProducts();
        Thread.sleep(5000);
        ScreenshotHelper.captureScreenshot(driver, "InventoryPage");

        inventoryPage.clickBikeLight();
        Thread.sleep(5000);
        ScreenshotHelper.captureScreenshot(driver, "BikeLightDetails");

        inventoryPage.addToCart();
        Thread.sleep(5000);
        ScreenshotHelper.captureScreenshot(driver, "BikeLightAdded");

        inventoryPage.clickCart();
        Thread.sleep(5000);
        ScreenshotHelper.captureScreenshot(driver, "CartPage");

        // Cart
        cartPage.checkout();
        Thread.sleep(5000);
        ScreenshotHelper.captureScreenshot(driver, "CheckoutInformation");

        // Checkout
        checkoutPage.enterCustomerDetails(
                "Manish",
                "Yadav",
                "201301"
        );
        Thread.sleep(5000);
        ScreenshotHelper.captureScreenshot(driver, "CustomerDetails");

        checkoutPage.clickContinue();
        Thread.sleep(5000);
        ScreenshotHelper.captureScreenshot(driver, "CheckoutOverview");

        checkoutPage.clickFinish();
        Thread.sleep(5000);
        ScreenshotHelper.captureScreenshot(driver, "OrderCompleted");

        checkoutPage.clickGeneratePDF();
        Thread.sleep(5000);
        ScreenshotHelper.captureScreenshot(driver, "PDFGenerated");

        checkoutPage.clickBackHome();
        Thread.sleep(5000);
        ScreenshotHelper.captureScreenshot(driver, "BackToHome");

        // Close Browser
        Helper.closeBrowser(driver);
    }
}