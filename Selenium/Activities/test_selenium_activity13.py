from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    # Open the page
    driver.get("https://training-support.net/webelements/tables")
    # Print the page title
    print("Page title is", driver.title)

    # Print the number of columns
    cols = driver.find_elements(By.XPATH, "//table/thead/tr/th")
    print("Number of columns: " , len(cols))
    # Print the number of rows
    rows = driver.find_elements(By.XPATH, "//table/tbody/tr")
    print("Number of rows: ", len(rows))

    # Find and print all the cell values in the third row of the table
    thirdRow = driver.find_elements(By.XPATH, "//table/tbody/tr[3]/td")
    for cell in thirdRow:
        print(cell.text)

    # Find and print the cell value at the second row second column
    secondRowSecondCol = driver.find_element(By.XPATH, "//table/tbody/tr[2]/td[2]").text
    print(secondRowSecondCol)

    # Close the browser
    driver.quit()    