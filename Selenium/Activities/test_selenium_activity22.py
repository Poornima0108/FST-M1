from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

with webdriver.Firefox() as driver:
    # Declare the wait variable
    wait = WebDriverWait(driver, timeout=10)

    # Open the page
    driver.get("https://training-support.net/webelements/popups")
    # Print the page title
    print("Page title is", driver.title)

    # Find the button on the page and click it to launch the popup
    driver.find_element(By.ID, "launcher").click()

    # Wait for the popup to appear
    wait.until(EC.element_to_be_clickable((By.ID, "username")))

    # Enter the credentials
    username = driver.find_element(By.ID, "username")
    password = driver.find_element(By.ID, "password")
    username.send_keys("admin")
    password.send_keys("password")
	# Click submit
    driver.find_element(By.XPATH, "//button[text()='Submit']").click()

    # Print the message on the page after logging in
    message = driver.find_element(By.CSS_SELECTOR, "h2.mt-5").text
    print(message)

    # Close the browser
    driver.quit()