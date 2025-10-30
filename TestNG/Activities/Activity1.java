package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	// Driver object
	WebDriver driver;
	// Declaring the wait object
	WebDriverWait wait;

	// Setup function
	@BeforeClass
	public void setUp() {
		// Initialize driver
		driver = new FirefoxDriver();
		// Initialize the wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Open the test page
		driver.get("https://training-support.net");
	}

	@Test(priority = 1)
	public void pageTitleTest() {
		// Get the page title
		String pageTitle = driver.getTitle();
		// Assertion
		Assert.assertEquals(pageTitle, "Training Support");
	}

	@Test(priority = 2)
	public void aboutLinkTest() {
		// Find and click the About Us link
		driver.findElement(By.linkText("About Us")).click();
		
		// Assertions
		wait.until(ExpectedConditions.titleContains("About"));
		Assert.assertEquals(driver.getTitle(), "About Training Support");
	}
	
	
	// Teardown function
	@AfterClass
	public void tearDown() {
		// Close the browser
		driver.quit();
	}
}
