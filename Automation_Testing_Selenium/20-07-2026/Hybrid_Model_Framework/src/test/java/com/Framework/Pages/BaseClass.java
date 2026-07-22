package com.Framework.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;


import utility.BrowserFactory;
import utility.ConifgDataProvider;
import utility.ExcelDataReader;
import utility.Helper;

public class BaseClass {
	public WebDriver driver;
	public ExcelDataReader excel;
	public ConifgDataProvider config;
	
	@BeforeSuite
	public void setup() {
		excel=new ExcelDataReader();
		config=new ConifgDataProvider();
	}
	@BeforeClass
	public void BrowserTest() {
		driver = BrowserFactory.BrowserOptions(driver,
		        config.getBrowser(),
		        config.getAppURL());
	}
	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			Helper.capturedScreenShot(driver);
		}
	}
}
