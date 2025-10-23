package activities;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {

	public static void main(String[] args) {
		// Initialize the driver object
		WebDriver driver = new FirefoxDriver();

		// Open the page
		driver.get("https://training-support.net/webelements/tables");
		// Print the title of the page
		System.out.println("Page title: " + driver.getTitle());

		// Print the number of columns
		List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println("Number of columns: " + cols.size());
		// Print the number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Number of rows: " + rows.size());
		
		// Find and print all the cell values in the third row of the table
		List<WebElement> thirdRow = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		for(WebElement cell : thirdRow) {
			System.out.println(cell.getText());
		}
		
		// Find and print the cell value at the second row second column
		String secondRowSecondCol = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println(secondRowSecondCol);
		
		// Close the browser
        driver.quit();
	}

}
