from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

with webdriver.Firefox() as driver:
    # Open the page
    driver.get("https://training-support.net/webelements/selects")
    # Print the page title
    print("Page title is", driver.title)

    # Find the select element
    combobox = driver.find_element(By.CSS_SELECTOR, "select.h-10")
    # Create the Select object
    dropdown = Select(combobox)

    # Select the second option using the visible text
    dropdown.select_by_visible_text("One")
    print(dropdown.first_selected_option.text)

    # Select the third option using the index
    dropdown.select_by_index(2)
    print(dropdown.first_selected_option.text)

    # Select the fourth option using the value
    dropdown.select_by_value("three")
    print(dropdown.first_selected_option.text)

    # Get all the options and print them to the console
    for option in dropdown.options:
        print(option.text)

    # Close the browser
    driver.quit()    