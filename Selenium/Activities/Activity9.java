package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {

	public static void main(String[] args) {
		// Initialize the driver object
		WebDriver driver = new FirefoxDriver();

		// Create the Actions object
		Actions builder = new Actions(driver);

		// Open the page
		driver.get("https://training-support.net/webelements/keyboard-events");
		// Print the title of the page
		System.out.println("Page title: " + driver.getTitle());
		
		// Type out a string from the Selenium script to show on the page
		builder.sendKeys("Text from Selenium script").sendKeys(Keys.RETURN).build().perform();
		
		// Print the message
		String message = driver.findElement(By.cssSelector("h1.mt-3")).getText();
		System.out.println(message);
		
		// Close the browser
        driver.quit();

	}

}
