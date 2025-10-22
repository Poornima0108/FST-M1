package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6 {

	public static void main(String[] args) {
		// Initialize the driver object
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Open the page
		driver.get("https://training-support.net/webelements/dynamic-controls");

		// Page title verification
		System.out.println("Page title: " + driver.getTitle());
		// Find the checkbox
		WebElement checkbox = driver.findElement(By.id("checkbox"));
		// Check if the checkbox is selected on the page
		System.out.println("Is checkbox selected? " + checkbox.isSelected());
		// Click the checkbox
		checkbox.click();
		// Check if the checkbox is selected on the page
		System.out.println("Is checkbox selected? " + checkbox.isSelected());

		// Close the browser
		driver.quit();

	}

}
