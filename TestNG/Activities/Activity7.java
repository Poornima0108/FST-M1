package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
	// Driver object
	WebDriver driver;

	// Setup function
	@BeforeClass(alwaysRun = true)
	public void setUp() {
		// Initialize driver
		driver = new FirefoxDriver();
		// Open the test page
		driver.get("https://training-support.net/webelements/login-form");
	}

	@DataProvider(name="Credentials")
	public Object[][] creds() {
		return new Object[][] {
			{"admin", "wrongPassword"},
			{"wrongAdmin", "password"},
			{"$_$", "DELETE TABLE users;"}
		};
	}
	
	@Test(priority = 1)
	public void pageTitleTest() {
		// Get the page title
		String pageTitle = driver.getTitle();
		// Assertion
		Assert.assertEquals(pageTitle, "Selenium: Login Form");
	}
	
	
	@Test(priority = 2, dataProvider="Credentials")
	public void invalidLoginTest(String username, String password) {
		// Find username and password fields
		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.id("password"));
		// Clear the input fields
		usernameField.clear();
		passwordField.clear();
		// Enter credentials
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		// Click submit
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}
	
	// Teardown function
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		// Close the browser
		driver.quit();
	}
}
