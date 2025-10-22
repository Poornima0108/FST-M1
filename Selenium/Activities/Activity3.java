package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		// Initialize the driver object
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open the page
		driver.get("https://training-support.net/webelements/login-form/");

		// Page title verification
		System.out.println("Page title: " + driver.getTitle());
		// Find username field and enter valid username
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		// Find password field and enter valid password
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password");
		// Find and click the submit button
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		// Print the success message
		String message = driver.findElement(By.xpath("//h2[contains(@class, 'text-gray-800')]")).getText();
		System.out.println(message);

		// Close the browser
		driver.quit();

	}

}
