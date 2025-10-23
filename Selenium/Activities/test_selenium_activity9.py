from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains, Keys

with webdriver.Firefox() as driver:
    # Create the Actions object
    actions = ActionChains(driver)

    # Open the page
    driver.get("https://training-support.net/webelements/keyboard-events")
    # Print the page title
    print("Page title is", driver.title)

    # Type out a string from the Selenium script to show on the page
    actions.send_keys("Text from Selenium script").send_keys(Keys.RETURN).perform()

    # Print the message
    message = driver.find_element(By.CSS_SELECTOR, "h1.mt-3").text
    print(message)

    # Close the browser
    driver.quit()