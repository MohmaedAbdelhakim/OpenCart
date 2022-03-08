package Tests;

import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testBase {
	
	public static WebDriver driver;
		

	@BeforeTest
	public static void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	}

}
