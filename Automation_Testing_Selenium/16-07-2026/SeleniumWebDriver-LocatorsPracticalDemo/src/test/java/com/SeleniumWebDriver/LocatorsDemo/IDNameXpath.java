package com.SeleniumWebDriver.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IDNameXpath {
	WebDriver driver;
	String baseURL="https://practicetestautomation.com/practice-test-login/";
	
	@Test
	public void IDLocator() {
		driver=new ChromeDriver();
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		
		//Locator ID Name and XPath
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		
		String expectedMessage = "Logged In Successfully";
		String actualMessage = driver.findElement(By.tagName("h1")).getText();

		Assert.assertEquals(actualMessage, expectedMessage);
	}

}
