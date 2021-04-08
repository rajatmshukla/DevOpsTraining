# -*- coding: utf-8 -*-
"""
Created on Mon Jan 25 13:01:03 2021

@author: RajatShukla
"""

def my_decorator(original_func):
    def wrapper():
        print("Inside a wrapper function Before")
        
        original_func()
        print("Execute inside a wrapper function After")
    
    return wrapper

@my_decorator
def sayHello():
    print('Say Hello')
    
#sayHello()

new_sayHello=my_decorator(sayHello)

new_sayHello()