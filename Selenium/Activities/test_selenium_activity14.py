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

    # Print the Book Name in the 5th row
    bookName = driver.find_element(By.XPATH, "//table/tbody/tr[5]/td[2]").text
    print("Book name: ", bookName)
		
    # Click the header of the Price column to sort it in ascending order
    driver.find_element(By.XPATH, "//table/thead/tr/th[5]").click()
		
    # Find and print the Book Name in the 5th row again
    bookName = driver.find_element(By.XPATH, "//table/tbody/tr[5]/td[2]").text
    print("Book name: ", bookName)
    
    # Close the browser
    driver.quit()