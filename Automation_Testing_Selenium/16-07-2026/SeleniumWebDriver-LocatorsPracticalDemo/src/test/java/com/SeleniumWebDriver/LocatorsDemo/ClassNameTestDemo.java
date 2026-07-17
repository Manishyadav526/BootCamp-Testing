package com.SeleniumWebDriver.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassNameTestDemo {
	WebDriver driver;
	String baseURL="https://www.hollandandbarrett.com/";
	
	@Test
	public void IDLocator() throws InterruptedException {
		driver=new ChromeDriver();
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		try {
		driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();
		} catch(Exception e) {
			System.out.println("Cookie pop up not displayed");
		}
		
		driver.findElement(By.xpath("//*[@id=\"_root_\"]/div[3]/div[1]/div/a[5]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"_root_\"]/div[6]/div/div[2]/div/div/a[8]/div[2]/img")).click();
		
		driver.findElement(By.xpath("//*[@id=\"_root_\"]/div[6]/div/div/div/div/a[8]/div[2]/img")).click();
		
		driver.findElement(By.xpath("//*[@id=\"products-list\"]/div/div[2]/div[1]/a/div/div[2]/div[2]/button/span")).click();
		
		String BrowserTitle =driver.getCurrentUrl();
		System.out.println(BrowserTitle);
		
		driver.navigate().back();
		BrowserTitle =driver.getCurrentUrl();
		System.out.println(BrowserTitle);
		
		driver.navigate().refresh();
		BrowserTitle =driver.getCurrentUrl();
		System.out.println(BrowserTitle);
		
		driver.navigate().forward();
		BrowserTitle =driver.getCurrentUrl();
		System.out.println(BrowserTitle);
		
		driver.quit();
		
	}

}
