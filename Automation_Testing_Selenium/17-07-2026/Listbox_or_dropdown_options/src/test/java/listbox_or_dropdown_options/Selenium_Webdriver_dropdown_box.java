package listbox_or_dropdown_options;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Selenium_Webdriver_dropdown_box {
	WebDriver driver;
	Select country_list;
	
	@BeforeClass
	public void setup() {
		    driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://testautomationpractice.blogspot.com/");
	    }	
	
	
    @Test
	public void DropDownList() throws Exception {
		WebElement Country_Dropdown=driver.findElement(By.id("country"));
		country_list=new Select(Country_Dropdown);
		
		country_list.selectByIndex(3);
		Thread.sleep(10000);
		country_list.selectByVisibleText("India");
		Thread.sleep(10000);
		
		WebElement option=country_list.getFirstSelectedOption();
		String countryindex=option.getText();
		System.out.println("Selected Country : " + countryindex);
		
		List<WebElement>c_list=country_list.getOptions();
		
		int total_country=c_list.size();
		System.out.println("Total Countries count in List : " + total_country);
		
		//print all country names
		for (WebElement ele : c_list) {

	            String countryy_name = ele.getText();
	            System.out.println("Country Name : " + countryy_name);
	        }
}
    @AfterClass
    public void tearDown() {

        driver.quit();
}
}
