from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:

    driver.get("https://training-support.net/")

    # Print the page title
    print(f"Page title is {driver.title}")

    # Find and click the About Us button
    driver.find_element(By.LINK_TEXT, "About Us").click()

    # Print the new page's title
    print(f"New page title is {driver.title}")

    # Close the browser
    driver.quit()