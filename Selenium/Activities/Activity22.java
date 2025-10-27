package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity22 {

	public static void main(String[] args) {
		// Initialize the driver object
		WebDriver driver = new FirefoxDriver();
		// Create the wait object
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Open the page
		driver.get("https://training-support.net/webelements/popups");
		// Print the title of the page
		System.out.println("Page title: " + driver.getTitle());
		
		// Find the button on the page and click it to launch the popup
		driver.findElement(By.id("launcher")).click();
		
		// Wait for the popup to appear
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
		
		// Enter the credentials
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		username.sendKeys("admin");
		password.sendKeys("password");
		// Click submit
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		// Print the message on the page after logging in
		String message = driver.findElement(By.cssSelector("h2.mt-5")).getText();
		System.out.println(message);
		
		// Close the browser
        driver.quit();
				
	}

}
