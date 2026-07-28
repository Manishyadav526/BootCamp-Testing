package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PurchaseProductSteps {

    WebDriver driver;

    @Given("User launches the browser")
    public void user_launches_the_browser() {

        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @And("User logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @When("User opens the Backpack product")
    public void user_opens_the_backpack_product() {

        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
    }

    @And("User adds the Backpack to the cart")
    public void user_adds_the_backpack_to_the_cart() {

        driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
    }

    @And("User returns to the inventory page")
    public void user_returns_to_the_inventory_page() {

        driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
    }

    @And("User opens the Bike Light product")
    public void user_opens_the_bike_light_product() {

        driver.findElement(By.xpath("//*[@id='item_0_title_link']/div")).click();
    }

    @And("User adds the Bike Light to the cart")
    public void user_adds_the_bike_light_to_the_cart() {

        driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
    }

    @And("User opens the shopping cart")
    public void user_opens_the_shopping_cart() {

        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
    }

    @And("User proceeds to checkout")
    public void user_proceeds_to_checkout() {

        driver.findElement(By.id("checkout")).click();
    }

    @And("User enters customer details")
    public void user_enters_customer_details() {

        driver.findElement(By.id("first-name")).sendKeys("Manish");
        driver.findElement(By.id("last-name")).sendKeys("Yadav");
        driver.findElement(By.id("postal-code")).sendKeys("201301");

        driver.findElement(By.id("continue")).click();
    }

    @And("User completes the purchase")
    public void user_completes_the_purchase() {

        driver.findElement(By.id("finish")).click();
    }

    @Then("Order should be placed successfully")
    public void order_should_be_placed_successfully() {

        System.out.println("Purchase Completed Successfully");

        driver.quit();
    }
}