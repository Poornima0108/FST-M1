package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	// Driver object
	WebDriver driver;
	// Declaring the wait object
	WebDriverWait wait;

	// Setup function
	@BeforeClass
	public void setUp() {
		// Initialize driver
		driver = new FirefoxDriver();
		// Open the test page
		driver.get("https://training-support.net/webelements/target-practice/");
	}

	@Test(priority = 1)
	public void pageTitleTest() {
		// Get the page title
		String pageTitle = driver.getTitle();
		// Assertion
		Assert.assertEquals(pageTitle, "Selenium: Target Practice");
	}
	
	@Test(priority = 2)
	public void findBlackButton() {
		WebElement button = driver.findElement(By.xpath("//button[text()='Black']"));
		Assert.assertEquals(button.getText(), "Black");
	}
	
	@Test(enabled=false, priority=3)
	public void skipTest() {
		String heading = driver.findElement(By.xpath("//h1[contains(text(),'Target')]")).getText();
		Assert.assertTrue(heading.contains("Target"));
	}
	
	@Test(priority = 4)
	public void skipExceptionTest() {
		throw new SkipException("Skipping the test case");
	}
	
	// Teardown function
	@AfterClass
	public void tearDown() {
		// Close the browser
		driver.quit();
	}
}
