package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.Iphone_Page;

public class BuyIphone_test extends testBase{

	@Test
	public void Buy_Iphone() {
		HomePage homePage=new HomePage(driver);
		homePage.click_iphone();
		
		Iphone_Page iphone_Page=new Iphone_Page(driver);
		iphone_Page.Buy_Iphone();
	}

}
