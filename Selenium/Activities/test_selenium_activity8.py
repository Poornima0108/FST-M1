from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains

with webdriver.Firefox() as driver:
    # Create the Actions object
    actions = ActionChains(driver)
    # Open the page
    driver.get("https://training-support.net/webelements/mouse-events")

    # Print the page title
    print("Page title is", driver.title)

    # Find the buttons on the page
    buttons = driver.find_elements(By.CSS_SELECTOR, "div.svelte-hs12g9")

    # Left click on the Cargo.lock button, move the cursor to the Cargo.toml button and then click it.
    actions.click(buttons[0]).pause(1).move_to_element(buttons[1]).pause(5).click(buttons[1]).perform()
    # Print the confirmation text at the end of the sequence
    message = driver.find_element(By.ID, "result").text
    print(message)

    # Double click on the src button. Then right click on the target button and select open.
    actions.double_click(buttons[2]).pause(2).context_click(buttons[3]).pause(2).perform()
    actions.click(driver.find_element(By.XPATH, "//span[text()='Open']")).pause(1).perform()
    # Print the confirmation text at the end of the sequence
    message = driver.find_element(By.ID, "result").text
    print(message)

    # Close the browser
    driver.quit()
