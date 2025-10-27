from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    # Declare the wait variable
    wait = WebDriverWait(driver, timeout=10)

    # Open the page
    driver.get("https://training-support.net/webelements/dynamic-attributes")
    # Print the page title
    print("Page title is", driver.title)

    # Find the input fields and type in the required data in the fields
    fullName = driver.find_element(By.XPATH, "//input[starts-with(@id, 'full-name')]")
    email = driver.find_element(By.XPATH, "//input[contains(@id, 'email')]")
    eventDate = driver.find_element(By.XPATH, "//input[contains(@name, '-event-date-')]")
    details = driver.find_element(By.XPATH, "//textarea[contains(@id, '-additional-details-')]")
    fullName.send_keys("Poornima Kulandaivelu")
    email.send_keys("poornima@abc.com")
    eventDate.send_keys("2025-10-30")
    details.send_keys("Test event")
    driver.find_element(By.XPATH, "//button[text()='Submit']").click()

    # Wait for success message to appear and print it to the console
    message = wait.until(EC.visibility_of_element_located((By.XPATH, "//h3[@id='action-confirmation']"))).text
    print(message)
    
    # Close the browser
    driver.quit()
