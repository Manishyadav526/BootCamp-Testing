package com.Count_no_of_radio_buttons;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utility.Helper;

public class RadioButtonsTest {
	WebDriver driver;

	@Test
	public void Spicejet() throws Exception {
	        driver = Helper.startBrowser("GC");
	        driver.manage().window().maximize();
	        driver.get("https://www.spicejet.com/");
	        driver.findElement(By.xpath("(//*[name()='circle'])[6]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//*[name()='circle'])[10]")).click();
	        Thread.sleep(2000);
	        
	        List<WebElement> circleElements=driver.findElements(By.xpath("(//*[name()='circle'])"));
	        
	        
	        //print each button details
	        System.out.println("===RADIO BUTTON DETAILS===");
	        for (int i = 0; i < circleElements.size(); i++) {

	            WebElement element = circleElements.get(i);

	            System.out.println("Button " + (i + 1) + ":");
	            System.out.println(" - Tag: " + element.getTagName());
	            System.out.println(" - Displayed: " + element.isDisplayed());
	            System.out.println(" - Enabled: " + element.isEnabled());
	            System.out.println(" - Class: " + element.getAttribute("class"));
	            System.out.println(" - Role: " + element.getAttribute("role"));
	            System.out.println(" - Aria-checked: " + element.getAttribute("aria-checked"));
	            System.out.println("----------------------------------------");
	        }

	        driver.quit();
	  }
}
