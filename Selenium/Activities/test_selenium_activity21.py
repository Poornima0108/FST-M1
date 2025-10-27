from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

with webdriver.Firefox() as driver:
    # Declare the wait variable
    wait = WebDriverWait(driver, timeout=10)

    # Open the page
    driver.get("https://training-support.net/webelements/tabs")
    # Print the page title
    print("Page title is", driver.title)

    # Find the button to open a new tab and click it
    driver.find_element(By.CSS_SELECTOR, "button.bg-purple-200").click()
    wait.until(EC.number_of_windows_to_be(2))

    # Print the handle of the current tab
    print("Current tab handle: " , driver.current_window_handle)
    # Print the handles of all open tabs
    print("All open tab handles: " , driver.window_handles)

    # Switch to the newest tab
    for handle in driver.window_handles:
        driver.switch_to.window(handle)

    # Print the handle of the current tab
    print("Current tab handle: " , driver.current_window_handle)
    # Print the title and message from the new page
    print("Title of the new tab: " , driver.title)
    print("Message on the new tab: " , driver.find_element(By.CSS_SELECTOR, "h2.text-gray-800").text)

    # Close the browser
    driver.quit()