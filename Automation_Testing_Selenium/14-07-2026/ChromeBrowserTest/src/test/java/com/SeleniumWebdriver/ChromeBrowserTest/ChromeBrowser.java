package com.SeleniumWebdriver.ChromeBrowserTest;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("https://www.youtube.com/watch?v=hlGoQC332VM&t=103s");
		Driver.manage().window().maximize();
		Driver.manage().window().minimize();
	}

}
