package Selenium_WebDriver_Multiple_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Utility.Helper;

public class Selenium_WebDriver_Multiple_frames {
	@Test
	public void Frames() throws Exception{
		WebDriver driver=Helper.startBrowser("GC");
		driver.get("file:///C:/Multiple_Frames/iframe.html");
		Thread.sleep(5000);
		
		int totalnoofframes=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of Frames: " +totalnoofframes);
		
		driver.switchTo().frame("easycalculation");
		driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
		driver.findElement(By.id("log_email")).sendKeys("9740673180");
		driver.findElement(By.id("log_password")).sendKeys("raghubn@123");
		
		
		//The program waits 10 seconds before clicking. During that time, the page finishes processing,
		//JavaScript completes, and the login button becomes clickable.
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//input[@name='log_submit']")).click();
		//Thread.sleep(10000);
		//Selenium tries to click immediately. If the page or JavaScript hasnt finished enabling the button,
		//the click may not work. Sleeping after the click cannot help because the click has already been attempted.
		
		
		
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		
		driver.navigate().to("file:///C:/Multiple_Frames/iframe.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/a")).click();
		driver.navigate().to("https://www.selenium.dev/");
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
		Thread.sleep(5000);
		String title1=driver.getTitle();
		System.out.println(title1);
		
		driver.navigate().to("file:///C:/Multiple_Frames/iframe.html");
		driver.switchTo().frame("My Store");
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		String title3=driver.getTitle();
		System.out.println(title3);
		Thread.sleep(5000);
		driver.quit();
		
	
		
	}
}
