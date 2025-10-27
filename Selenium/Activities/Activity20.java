package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 {

	public static void main(String[] args) {
		// Initialize the driver object
		WebDriver driver = new FirefoxDriver();

		// Open the page
		driver.get("https://training-support.net/webelements/alerts");
		// Print the title of the page
		System.out.println("Page title: " + driver.getTitle());

		// Find the button to open a PROMPT alert and click it
		WebElement prompt = driver.findElement(By.xpath("//button[@id='prompt']"));
		prompt.click();
		
		// Switch the focus from the main window to the Alert box and get the text in it and print it
		Alert promptAlert = driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		
		// Type "Awesome!" into the prompt
		promptAlert.sendKeys("Awesome!");
		
		// Close the alert by clicking Ok
		promptAlert.accept();
		
		// Print the message
		String message = driver.findElement(By.id("result")).getText();
		System.out.println(message);
		
		// Close the browser
        driver.quit();

	}

}
