package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends pageBase {

	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[text()='My Account']")
	WebElement MyAccounts;
	
	@FindBy(xpath = "//a[text()='Register']")
	WebElement Register_Link;
	
	@FindBy(xpath = "//img[@alt='MacBook']")
	WebElement MacBook;
	
	@FindBy(xpath = "//img[@alt='iPhone']")
	WebElement iphone;
	
	public void user_Register() {
		click(MyAccounts);
		click(Register_Link);
	}
	
	public void Click_MacBook() {
		click(MacBook);
	}
	
	public void click_iphone() {
		click(iphone);
	}
}
