# -*- coding: utf-8 -*-
"""
Created on Tue Feb  2 12:09:25 2021

@author: RajatShukla
"""

from selenium import webdriver

class ChromeDriverDemo:
    def test(self):
        driver = webdriver.Chrome(executable_path="C:/Users/RajatShukla/Downloads/chromedriver_win32/chromedriver.exe" )
        driver.get("https://rajatmshukla.wordpress.com/2021/01/10/lockdowns-kill-physically-and-mentally/");
        searchElement = driver.find_element_by_name("q")
        searchElement.send_keys("ibm")
        searchElement.submit()

ChromeDriverDemo = ChromeDriverDemo()
ChromeDriverDemo.test()