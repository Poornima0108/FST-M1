package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity4 {

	public static void main(String[] args) {
		// Initialize the driver object
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Open the page
		driver.get("https://training-support.net/webelements/target-practice");

		// Page title verification
		System.out.println("Page title: " + driver.getTitle());
		// Find the 3rd header on the page and print it's text
		String ThirdHeaderTxt = driver.findElement(By.xpath("//h3[contains(text(), 'Heading #3')]")).getText();
		System.out.println("Third header is: " + ThirdHeaderTxt);
		// Find the 5th header on the page and print it's color
		Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(), 'Heading #5')]")).getCssValue("color"));
		System.out.println("Color as RGB: " + fifthHeaderColor.asRgb());
		System.out.println("Color as hexcode: " + fifthHeaderColor.asHex());
		// Find the purple button and print all it's classes
		String purpleButtonClasses = driver.findElement(By.xpath("//button[contains(text(), 'Purple')]")).getDomAttribute("class");
		System.out.println("Purple button classes: " + purpleButtonClasses);
		// Find the slate button and print it's text
		String slateButtonText = driver.findElement(By.xpath("//button[contains(@class, 'text-slate-900')]")).getText();
		System.out.println("Slate button text: " + slateButtonText);

		// Close the browser
		driver.quit();
	}

}
