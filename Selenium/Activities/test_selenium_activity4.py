from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.color import Color

with webdriver.Firefox() as driver:

    driver.get("https://training-support.net/webelements/target-practice")

    # Print the page title
    print(f"Page title is {driver.title}")
		
	# Find the 3rd header on the page and print it's text
    third_header_text = driver.find_element(By.XPATH, "//h3[contains(text(), 'Heading #3')]").text
    print("Third header is: ", third_header_text)
	# Find the 5th header on the page and print it's color
    fifth_header_color = Color.from_string(driver.find_element(By.XPATH, "//h5[contains(text(), 'Heading #5')]").value_of_css_property("color"));	
    print("Color as RGB:", fifth_header_color.rgb)
    print("Color as hexcode: ", fifth_header_color.hex)
    # Find the purple button and print all it's classes
    purple_button_classes = driver.find_element(By.XPATH, "//button[contains(text(), 'Purple')]").get_dom_attribute("class");	
    print("Purple button classes: ", purple_button_classes)
    # Find the slate button and print it's text
    slate_button_text = driver.find_element(By.XPATH, "//button[contains(@class, 'text-slate-900')]").text
    print("Slate button text: " , slate_button_text)
    # Close the browser
    driver.quit()
		