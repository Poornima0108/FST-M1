package activities;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {

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
		
		// Print the Book Name in the 5th row
		String bookName = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText();
		System.out.println("Book name: "+ bookName);
		
		// Click the header of the Price column to sort it in ascending order
		driver.findElement(By.xpath("//table/thead/tr/th[5]")).click();
		
		// Find and print the Book Name in the 5th row again
		bookName = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText();
		System.out.println("Book name: "+ bookName);
		
		// Close the browser
        driver.quit();
	}

}
