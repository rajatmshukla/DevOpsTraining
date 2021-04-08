# -*- coding: utf-8 -*-
"""
Created on Fri Jan 22 16:19:01 2021

@author: RajatShukla
"""

class person:
    company = "IBM"
    persons = 1000
    def __init__(self,name,persons):
        self.name=name
        self.persons=persons
    def sayHello(self,msg="Py"):
        print(f'Hello {msg}')
    def get_total_persons(self):
        print(self.persons)
    
person1 = person('name',500)
person1.sayHello("JS")
person1.get_total_persons()
# print(person1.name)
# print(person1.company)
# print(type(person1))