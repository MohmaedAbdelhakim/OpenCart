package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class pageBase {
	
	private WebDriver driver;
	
	public pageBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//click on element
	public static void click(WebElement element) {
		element.click();
	}
	
	//set text
	public static void setText(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	//assert true
	public static void assertTrue(WebElement element, String text) {
		Assert.assertTrue(element.getText().contains(text));
	}


}
