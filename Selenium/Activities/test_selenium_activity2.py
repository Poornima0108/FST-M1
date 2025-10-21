from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:

    driver.get("https://training-support.net/webelements/login-form")

    # Print the page title
    print(f"Page title is {driver.title}")

    # Find the username field
    username = driver.find_element(By.ID, "username")
    # Find the password field
    password = driver.find_element(By.ID, "password")

    # Enter username
    username.send_keys("admin")
    # Enter password
    password.send_keys("password")

    # Find and click the submit button
    submit = driver.find_element(By.XPATH, "//button[text()='Submit']")
    submit.click()

    # Print the success message
    message = driver.find_element(By.CSS_SELECTOR, "h2.text-gray-800")
    print("Success message: ", message.text)

    # Close the browser
    driver.quit()