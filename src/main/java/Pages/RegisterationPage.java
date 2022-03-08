package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterationPage extends pageBase {

	public RegisterationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "input-firstname")
	WebElement FirstName;
	
	@FindBy(id = "input-lastname")
	WebElement LastName;
	
	@FindBy(id = "input-email")
	WebElement Email;
	
	@FindBy(id = "input-telephone")
	WebElement Telephone;
	
	@FindBy(id = "input-password")
	WebElement Password;
	
	@FindBy(id = "input-confirm")
	WebElement ConfirmPassword;
	
	@FindBy(xpath = "//div[@class='form-group']/div/label[1]")
	WebElement yes_label;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement Accept;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement ContinueBtn;
	
	@FindBy(xpath = "//div[@id='content']/h1")
	WebElement SuccessMsg;
	
	@FindBy(xpath = "//div[@class='buttons']/div/a")
	WebElement Continue_SuccessMsg;
	
	@FindBy(xpath = "//div[@id='logo']/h1/a")
	WebElement logo;
	
	public void Register(String first_name, String last_name, String email, String telephone, String password, String confirm_password) {
		setText(FirstName, first_name);
		setText(LastName, last_name);
		setText(Email, email);
		setText(Telephone, telephone);
		setText(Password, password);
		setText(ConfirmPassword, confirm_password);
		click(yes_label);
		click(Accept);
		click(ContinueBtn);
		assertTrue(SuccessMsg, "Your Account Has Been Created!");
		click(Continue_SuccessMsg);
		//go to home page
		click(logo);
	}
	
	
}
