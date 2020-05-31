package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.silentOutput", "true");
		driver = new ChromeDriver();
	}
	
	@Test
	public void doLogin() {
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("test123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("xyz");
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
