package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators
	By txtUsername = By.id("user-name");

	By txtPassword = By.id("password");

	By btnLogin = By.id("login-button");

	// Inventory Page Locator (used to verify successful login)
	By inventoryContainer = By.id("inventory_container");

	// Login Method
	public void login(String username, String password) {

		driver.findElement(txtUsername).sendKeys(username);

		driver.findElement(txtPassword).sendKeys(password);

		driver.findElement(btnLogin).click();
	}

	// Verify Login Success
	public boolean isLoginSuccessful() {

		return driver.findElements(inventoryContainer).size() > 0;
	}
}