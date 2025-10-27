package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {

	public static void main(String[] args) {
		// Initialize the driver object
		WebDriver driver = new FirefoxDriver();

		// Open the page
		driver.get("https://training-support.net/webelements/selects");
		// Print the title of the page
		System.out.println("Page title: " + driver.getTitle());
		
		// Find the select element
		WebElement combobox = driver.findElement(By.cssSelector("select.h-10"));
		// Create the Select object
		Select dropdown = new Select(combobox);
		
		// Select the second option using the visible text
		dropdown.selectByVisibleText("One");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		// Select the third option using the index
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		// Select the fourth option using the value
		dropdown.selectByValue("three");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		// Get all the options and print them to the console
		for (WebElement option : dropdown.getOptions()) {
			System.out.println(option.getText());
		}
		
		// Close the browser
        driver.quit();

	}

}
