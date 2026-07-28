package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver;

    // Constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By firstName = By.id("first-name");

    By lastName = By.id("last-name");

    By postalCode = By.id("postal-code");

    By continueButton = By.id("continue");

    By finishButton = By.id("finish");

    By generatePDF = By.xpath("//button[text()='Generate PDF order']");

    By backHome = By.xpath("//*[@id=\"back-to-products\"]");

    // Methods

    public void enterCustomerDetails(String fname, String lname, String zip) {

        driver.findElement(firstName).sendKeys(fname);

        driver.findElement(lastName).sendKeys(lname);

        driver.findElement(postalCode).sendKeys(zip);
    }

    public void clickContinue() {

        driver.findElement(continueButton).click();
    }

    public void clickFinish() {

        driver.findElement(finishButton).click();
    }

    public void clickGeneratePDF() {

        driver.findElement(generatePDF).click();
    }

    public void clickBackHome() {

        driver.findElement(backHome).click();
    }
}