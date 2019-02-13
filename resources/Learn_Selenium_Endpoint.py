from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities

desired_cap = {
 'browserName':'chrome'
}

driver = webdriver.Remote(command_executor='http://localhost:4446/wd/hub', desired_capabilities=desired_cap)

driver.get("https://the-internet.herokuapp.com/login")

ele = driver.find_element_by_xpath(".//button[@type='submit']")

ele.click()

driver.quit()