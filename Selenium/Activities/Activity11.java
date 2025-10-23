package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {

	public static void main(String[] args) {
		// Initialize the driver object
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// Open the page
		driver.get("https://training-support.net/webelements/dynamic-controls");
		// Print the title of the page
		System.out.println("Page title: " + driver.getTitle());

		// Find the checkbox
		WebElement checkbox = driver.findElement(By.id("checkbox"));
		System.out.println("Is checkbox visible? "+ checkbox.isDisplayed());
		
		// Click the "Toggle Checkbox" button to remove the checkbox
		WebElement toggleCheckbox = driver.findElement(By.xpath("//button[text()='Toggle Checkbox']"));
		toggleCheckbox.click();	
		
		// Wait for the checkbox to disappear
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		System.out.println("Is checkbox visible? "+ checkbox.isDisplayed());
		
		// Toggle the checkbox again
		toggleCheckbox.click();
		
		// Wait for checkbox to appear and then select it
		wait.until(ExpectedConditions.elementToBeClickable(checkbox)).click();
		System.out.println("Is checkbox selected? "+ checkbox.isSelected());
		
		// Close the browser
        driver.quit();
	}

}
