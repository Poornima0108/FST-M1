package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// Initialize the driver object
		WebDriver driver = new FirefoxDriver();

		// Open the page
		driver.get("https://training-support.net/webelements/login-form/");

		// Page title verification
		System.out.println("Page title: " + driver.getTitle());
		// Find username field and enter valid username
		driver.findElement(By.id("username")).sendKeys("admin");
		// Find password field and enter valid password
		driver.findElement(By.id("password")).sendKeys("password");
		// Find and click the submit button
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		// Print the success message
		String message = driver.findElement(By.cssSelector("h2.text-gray-800")).getText();
		System.out.println(message);
		
		// Close the browser
		driver.quit();

	}

}
