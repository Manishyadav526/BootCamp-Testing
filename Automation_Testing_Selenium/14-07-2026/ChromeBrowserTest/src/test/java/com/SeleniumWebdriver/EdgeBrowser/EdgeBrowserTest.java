package com.SeleniumWebdriver.EdgeBrowser;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.youtube.com/watch?v=hlGoQC332VM&t=103s");
		driver.manage().window().maximize();


	}

}
