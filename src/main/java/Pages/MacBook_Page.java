package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MacBook_Page extends pageBase {
	
	public MacBook_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "button-cart")
	WebElement AddTocart_Btn;
	
	@FindBy(xpath = "//ul[@class='list-inline']/li[4]")
	WebElement shoppingList;
	
	@FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[2]/a")
	WebElement ProductName;
	
	@FindBy(xpath = "//div[@id='logo']/h1/a")
	WebElement logo;
	
	public void Buy_macbook() {
		click(AddTocart_Btn);
		click(shoppingList);
		assertTrue(ProductName, "MacBook");
		click(logo);
	}
}
