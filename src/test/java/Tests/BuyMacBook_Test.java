package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.MacBook_Page;

public class BuyMacBook_Test extends testBase {
	
	@Test
	public void userBuy_MacBook() {
		HomePage homePage=new HomePage(driver);
		homePage.Click_MacBook();
		
		MacBook_Page macBook_page=new MacBook_Page(driver);
		macBook_page.Buy_macbook();
		
	}

}
