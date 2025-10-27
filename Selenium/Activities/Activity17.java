package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {

	public static void main(String[] args) {
		// Initialize the driver object
		WebDriver driver = new FirefoxDriver();

		// Open the page
		driver.get("https://training-support.net/webelements/selects");
		// Print the title of the page
		System.out.println("Page title: " + driver.getTitle());

		// Find the select element
		WebElement listbox = driver.findElement(By.cssSelector("select.h-80"));
		// Create the Select object
		Select multilist = new Select(listbox);
		
		// Deselect Rust
		multilist.deselectAll();
		
		// Select the "HTML" option using the visible text
		multilist.selectByVisibleText("HTML");
		
		// Select the 4th, 5th and 6th options using the index
		for(int i=3; i<=5; i++) {
			multilist.selectByIndex(i);
		}
		
		// Select the "Node" option using the value
		multilist.selectByValue("nodejs");
		
		// Deselect the 5th option using index
		multilist.deselectByIndex(4);
		
		// Print all the selected options
		for (WebElement option : multilist.getAllSelectedOptions()) {
			System.out.println(option.getText());
		}
		
		// Close the browser
        driver.quit();

	}

}
