package com.Selenium.Webdriver.FirefoxTest;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/watch?v=hlGoQC332VM&t=103s");
		driver.manage().window().maximize();

	}
}
