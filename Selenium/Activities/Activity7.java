package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7 {

	public static void main(String[] args) {
		// Initialize the driver object
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Open the page
		driver.get("https://training-support.net/webelements/dynamic-controls");

		// Page title verification
		System.out.println("Page title: " + driver.getTitle());
		// Find the text box field
		WebElement textbox = driver.findElement(By.id("textInput"));
		// Check if the text box is enabled on the page
		System.out.println("Is text box enabled? " + textbox.isEnabled());
		// Click the 'Enable Input' button
		driver.findElement(By.id("textInputButton")).click();
		// Check if the text box is enabled on the page
		System.out.println("Is text box enabled? " + textbox.isEnabled());
		
		// Enter value in text box
		textbox.sendKeys("Test text box");
		System.out.println(textbox.getDomProperty("value"));
		
		// Close the browser
		driver.quit();

	}

}
