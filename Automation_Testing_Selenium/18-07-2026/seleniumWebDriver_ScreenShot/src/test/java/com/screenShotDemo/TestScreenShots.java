package com.screenShotDemo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScreenShots {
	@Test
	public void Browser() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./ScreenShots/FacebookHomepage.png"));
		System.out.println("Captured ScreenShot");
		driver.quit();
	}

}
