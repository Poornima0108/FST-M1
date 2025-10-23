package activities;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {

	public static void main(String[] args) {
		// Initialize the driver object
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Open the page
		driver.get("https://training-support.net/webelements/dynamic-content");

		// Find and click the button
		driver.findElement(By.xpath("//button[@id='genButton']")).click();
		// Find the word element
		WebElement wordElement = driver.findElement(By.id("word"));
		// Wait for the required word
		wait.until(ExpectedConditions.textToBePresentInElement(wordElement, "release"));
		// Print the word
		System.out.println(wordElement.getText());

		// Close the browser
		driver.quit();

	}

}
