package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity21 {

	public static void main(String[] args) {
		// Initialize the driver object
		WebDriver driver = new FirefoxDriver();
		// Create the wait object
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Open the page
		driver.get("https://training-support.net/webelements/tabs");
		// Print the title of the page
		System.out.println("Page title: " + driver.getTitle());
		
		// Find the button to open a new tab and click it
		driver.findElement(By.cssSelector("button.bg-purple-200")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));		
		// Print the handle of the current tab
		System.out.println("Current tab handle: " + driver.getWindowHandle());
		// Print the handles of all open tabs
		System.out.println("All open tab handles: " + driver.getWindowHandles());
		
		// Switch to the newest tab
		for(String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		
		// Print the handle of the current tab
		System.out.println("Current tab handle: " + driver.getWindowHandle());
		// Print the title and message from the new page
		System.out.println("Title of the new tab: " + driver.getTitle());
		System.out.println("Message on the new tab: " + driver.findElement(By.cssSelector("h2.text-gray-800")).getText());
		
		// Close the browser
        driver.quit();			
	}
}
