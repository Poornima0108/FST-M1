package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {

	// Driver object
	WebDriver driver;

	// Setup function
	@BeforeClass(alwaysRun = true)
	public void setUp() {
		// Initialize driver
		driver = new FirefoxDriver();
		// Open the test page
		driver.get("https://training-support.net/webelements/target-practice");
	}
	
	@Test(groups = { "HeaderTests", "ButtonTests" })
	public void pageTitleTest() {
		// Get the page title
		String pageTitle = driver.getTitle();
		// Assertion
		Assert.assertEquals(pageTitle, "Selenium: Target Practice");
	}
	
	// Find the third header and assert the text in the h3 tag
	@Test(dependsOnMethods = { "pageTitleTest" }, groups = { "HeaderTests" })
	public void headerTest1() {
		String thirdHeader = driver.findElement(By.cssSelector("h3.text-3xl")).getText();
		Assert.assertEquals(thirdHeader, "Heading #3");
	}
	
	// Find and assert the colour of the fifth header tag element
	@Test(dependsOnMethods = { "pageTitleTest" }, groups = { "HeaderTests" })
	public void headerTest2() {
		Color header5Color = Color.fromString(driver.findElement(By.cssSelector("h5.text-purple-600")).getCssValue("color"));
        Assert.assertEquals(header5Color.asHex(), "#9333ea");
	}
	
	// Find the button with the class emerald and assert it text
	@Test(dependsOnMethods = { "pageTitleTest" }, groups = { "ButtonTests" })
	public void buttonTest1() {
        WebElement button1 = driver.findElement(By.xpath("//button[contains(@class, 'emerald')]"));
        Assert.assertEquals(button1.getText(), "Emerald");
    }
	
	// Find and assert the colour of the first button in the third row
    @Test(dependsOnMethods = { "pageTitleTest" }, groups = { "ButtonTests" })
    public void buttonTest2() {
        Color button2Color = Color.fromString(driver.findElement(By.xpath("//button[contains(@class, 'purple')]")).getCssValue("color"));
        Assert.assertEquals(button2Color.asHex(), "#581c87");
    }
	
	// Teardown function
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		// Close the browser
		driver.quit();
	}
}
