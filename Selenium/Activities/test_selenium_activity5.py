from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:

    driver.get("https://training-support.net/webelements/dynamic-controls")

    # Print the page title
    print(f"Page title is {driver.title}")
    # Find the checkbox
    checkbox = driver.find_element(By.ID, "checkbox")
	# Check if the checkbox is visible on the page
    print("Is checkbox visible? " , checkbox.is_displayed())
    # Find and click the toggle checkbox button
    driver.find_element(By.XPATH, "//button[text()= 'Toggle Checkbox']").click()
    # Check if the checkbox is visible on the page
    print("Is checkbox visible? " , checkbox.is_displayed())
    
     # Close the browser
    driver.quit()