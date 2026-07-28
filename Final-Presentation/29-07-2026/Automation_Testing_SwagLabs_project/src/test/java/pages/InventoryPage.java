package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    WebDriver driver;

    // Constructor
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By backpack = By.xpath("//div[text()='Sauce Labs Backpack']");

    By bikeLight = By.xpath("//*[@id='item_0_title_link']/div");
    
    By addToCart = By.xpath("//button[@id='add-to-cart']");

    By backToProducts = By.xpath("//button[@id='back-to-products']");
    
    By cartButton = By.xpath("//a[@class='shopping_cart_link']");

    // Methods

    public void clickBackpack() {

        driver.findElement(backpack).click();
    }

    public void clickBikeLight() {

        driver.findElement(bikeLight).click();
    }

    public void addToCart() {

        driver.findElement(addToCart).click();
    }

    public void backToProducts() {

        driver.findElement(backToProducts).click();
    }
    
    public void clickCart() {
        driver.findElement(cartButton).click();
    }
}