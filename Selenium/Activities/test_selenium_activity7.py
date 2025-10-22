from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:

    driver.get("https://training-support.net/webelements/dynamic-controls")

    # Print the page title
    print(f"Page title is {driver.title}")
    # Find the text box field
    textbox = driver.find_element(By.ID, "textInput")
	# Check if the text box is enabled on the page
    print("Is text box enabled? " , textbox.is_enabled())
    # Click the 'Enable Input' button
    driver.find_element(By.ID, "textInputButton").click()
    # Check if the text box is enabled on the page
    print("Is text box enabled? " , textbox.is_enabled())
    # Enter value in text box
    textbox.send_keys("Test text box")
    textbox_text = textbox.get_attribute("value")
    print(textbox_text)
    # Close the browser
    driver.quit()