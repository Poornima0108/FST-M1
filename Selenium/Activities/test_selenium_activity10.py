from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains

with webdriver.Firefox() as driver:
    # Create the Actions object
    actions = ActionChains(driver)

    # Open the page
    driver.get("https://training-support.net/webelements/drag-drop")
    # Print the page title
    print("Page title is", driver.title)

    # Find the football
    football = driver.find_element(By.ID, "ball")
    # Find the dropzone1
    dropzone1 = driver.find_element(By.ID, "dropzone1")
    # Find the dropzone2
    dropzone2 = driver.find_element(By.ID, "dropzone2")

    # Drag and drop football to dropzone1
    actions.click_and_hold(football).move_to_element(dropzone1).pause(5).release().perform()
    if(dropzone1.find_element(By.CLASS_NAME, "dropzone-text").text == "Dropped!"):
           print("Ball is dropped in Dropzone 1")

    # Drag and drop football to dropzone2                
    actions.drag_and_drop(football, dropzone2).pause(5).perform()
    if(dropzone2.find_element(By.CLASS_NAME, "dropzone-text").text == "Dropped!"):
         print("Ball is dropped in Dropzone 2")
			
    # Close the browser
    driver.quit()            

        