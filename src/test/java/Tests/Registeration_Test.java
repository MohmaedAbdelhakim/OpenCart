package Tests;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.RegisterationPage;

public class Registeration_Test extends testBase {

	@Test
	public void user_Registeration() {
		Faker faker = new Faker();
		HomePage homePage = new HomePage(driver);
		homePage.user_Register();
		
		RegisterationPage registerationPage=new RegisterationPage(driver);
		registerationPage.Register(faker.name().firstName(), faker.name().lastName(),faker.internet().emailAddress(), faker.phoneNumber().cellPhone(), "mohamedhakim123456", "mohamedhakim123456");
	}

}
