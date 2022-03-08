package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Iphone_Page extends pageBase {

	public Iphone_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	@FindBy(id = "button-cart")
	WebElement AddToCart_Btn;
	
	@FindBy(xpath = "//ul[@class='list-inline']/li[4]")
	WebElement shoppingList;
	
	@FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[2]/a")
	WebElement ProductName;

	public void Buy_Iphone() {
		click(AddToCart_Btn);
		click(shoppingList);
		assertTrue(ProductName, "iPhone");
	}
	
}
