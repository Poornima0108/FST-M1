package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		// Initialize the driver object
		WebDriver driver = new FirefoxDriver();

		// Open the page
		driver.get("https://training-support.net/");

		// Page title verification
		System.out.println("Page title: " + driver.getTitle());

		// Find and click the About Us button
		driver.findElement(By.cssSelector("a.card.svelte-4bhb3l")).click();

		// Print the new page's title
		System.out.println("New page title: " + driver.getTitle());

		// Close the browser
		driver.quit();

	}

}
