from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

with webdriver.Firefox() as driver:
    # Declare the wait variable
    wait = WebDriverWait(driver, timeout=10)

    # Open the page
    driver.get("https://training-support.net/webelements/dynamic-controls")
    # Print the page title
    print("Page title is", driver.title)

    # Find the checkbox
    checkbox = driver.find_element(By.ID, "checkbox")
    print("Is checkbox visible? ", checkbox.is_displayed())

    # Click the "Toggle Checkbox" button to remove the checkbox
    toggleCheckbox = driver.find_element(By.XPATH, "//button[text()='Toggle Checkbox']")
    toggleCheckbox.click()

    # Wait for the checkbox to disappear
    wait.until(EC.invisibility_of_element(checkbox))
    print("Is checkbox visible? ", checkbox.is_displayed())

    # Toggle the checkbox again
    toggleCheckbox.click()

    # Wait for checkbox to appear and then select it
    wait.until(EC.element_to_be_clickable(checkbox)).click()
    print("Is checkbox selected? ", checkbox.is_selected())

    # Close the browser
    driver.quit()