package com.screenShotsConcepts;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotConcept {
	
	public static void main (String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//TakesScreenshot is an interface to take screenshot
		FileUtils.copyFile(src, new File ("./ScreenShots/GoogleHomepage.png"));
		//FileUtils is a function of the common.io library which is used to take screenshot
		//. means in the same root folder create folder Screenshots and saved as the given name
		driver.quit();
		
		//if we use chrome driver and chrome driver  , we cant execute parallel testing because we cant change to it another browser
		//for parallel tetsing we should use web driver ..
	}
}
