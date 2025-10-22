from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:

    driver.get("https://training-support.net/webelements/dynamic-controls")

    # Print the page title
    print(f"Page title is {driver.title}")
    # Find the checkbox
    checkbox = driver.find_element(By.ID, "checkbox")
	# Check if the checkbox is selected on the page
    print("Is checkbox selected? " , checkbox.is_selected())
    # Click the checkbox
    checkbox.click()
    # Check if the checkbox is selected on the page
    print("Is checkbox selected? " , checkbox.is_selected())
    
     # Close the browser
    driver.quit()