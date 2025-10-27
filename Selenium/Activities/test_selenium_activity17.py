from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

with webdriver.Firefox() as driver:
    # Open the page
    driver.get("https://training-support.net/webelements/selects")
    # Print the page title
    print("Page title is", driver.title)

    # Find the select element
    listbox = driver.find_element(By.CSS_SELECTOR, "select.h-80")
    # Create the Select object
    multilist = Select(listbox)

    # Deselect Rust
    multilist.deselect_all

    # Select the "HTML" option using the visible text
    multilist.select_by_visible_text("HTML")

    # Select the 4th, 5th and 6th options using the index
    for i in range(3,5):
        multilist.select_by_index(i)

    # Select the "Node" option using the value
    multilist.select_by_value("nodejs")

    # Deselect the 5th option using index
    multilist.deselect_by_index(4)

    # Print all the selected options
    for option in multilist.options:
        print(option.text)

    # Close the browser
    driver.quit()    