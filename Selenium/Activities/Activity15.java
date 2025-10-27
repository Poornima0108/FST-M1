package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {

	public static void main(String[] args) {
		// Initialize the driver object
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Open the page
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		// Print the title of the page
		System.out.println("Page title: " + driver.getTitle());
		
		// Find the input fields and type in the required data in the fields
		WebElement fullName = driver.findElement(By.xpath("//input[starts-with(@id, 'full-name')]"));
		WebElement email = driver.findElement(By.xpath("//input[contains(@id, 'email')]"));
		WebElement eventDate = driver.findElement(By.xpath("//input[contains(@name, '-event-date-')]"));
		WebElement details = driver.findElement(By.xpath("//textarea[contains(@id, '-additional-details-')]"));
		fullName.sendKeys("Poornima Kulandaivelu");
		email.sendKeys("poornima@abc.com");
		eventDate.click();
		eventDate.sendKeys("2025-10-30");
		details.sendKeys("Test event");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		// Wait for success message to appear and print it to the console
		String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@id='action-confirmation']"))).getText();
		System.out.println(message);
		// Close the browser
        driver.quit();

	}

}
