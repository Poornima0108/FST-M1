from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

with webdriver.Firefox() as driver:
    # Declare the wait variable
    wait = WebDriverWait(driver, timeout=10)

    # Open the page
    driver.get("https://training-support.net/webelements/dynamic-content")
    # Print the page title
    print("Page title is", driver.title)

    # Find and click the button
    driver.find_element(By.XPATH, "//button[@id='genButton']").click()
	# Wait for the required word and print the word
    if(wait.until(EC.text_to_be_present_in_element((By.ID, "word"), "release"))):
        print(driver.find_element(By.ID, "word").text)

    # Close the browser
    driver.quit()