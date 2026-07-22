package com.WebDriver.Comments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BrowserComments {
	@Test(priority=0)
	public void ChromeBrowserTest() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://docs.langchain.com/");
		driver.manage().window().maximize();
		
		String BrowserTitle=driver.getTitle();
		System.out.println(BrowserTitle);
		
		String BrowserURL=driver.getCurrentUrl();
		System.out.println(BrowserURL);
		
		/*
		String PageContent=driver.getPageSource();
		System.out.println(PageContent);
		*/
		driver.quit();
		
	}
	@Test(priority=1)
	public void FirefoxBrowserTest() {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://docs.langchain.com/");
		driver.manage().window().maximize();
		
		driver.quit();
		
	}
	
	@Test(priority=2)
	public void EdgeBrowserTest() {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://docs.langchain.com/");
		driver.manage().window().maximize();
		
		
		driver.quit();
	}

}
