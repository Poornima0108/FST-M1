from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

with webdriver.Firefox() as driver:
    # Declare the wait variable
    wait = WebDriverWait(driver, timeout=10)

    # Open the page
    driver.get("https://training-support.net/webelements/alerts")
    # Print the page title
    print("Page title is", driver.title)

    # Find the button to open a PROMPT alert and click it
    driver.find_element(By.XPATH, "//button[@id='prompt']").click()

    # Switch the focus from the main window to the Alert box and get the text in it and print it
    promptAlert = wait.until(EC.alert_is_present())
    print(promptAlert.text)

    # Type "Awesome!" into the prompt
    promptAlert.send_keys("Awesome!")

    # Close the alert by clicking Ok
    promptAlert.accept()

     # Print the message
    message = driver.find_element(By.ID, "result").text
    print(message)

    # Close the browser
    driver.quit() 

