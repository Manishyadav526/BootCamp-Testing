package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By removeProduct = By.id("remove-sauce-labs-backpack");
    By checkout = By.id("checkout");
    By continueShopping = By.id("continue-shopping");

    // Methods
    public void removeProduct() {
        driver.findElement(removeProduct).click();
    }

    public void checkout() {
        driver.findElement(checkout).click();
    }

    public void continueShopping() {
        driver.findElement(continueShopping).click();
    }
}