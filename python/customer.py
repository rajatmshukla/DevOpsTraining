# -*- coding: utf-8 -*-
"""
Created on Fri Jan 22 17:51:56 2021

@author: RajatShukla
"""

class Customer:
    def __init__(self,name,age,email):
        self.name =name
        self.age =age
        self.email =email
        
    def __str__(self):
        return self.name+" "+self.email+" "+str(self.age)

customer1 = Customer('Some Name', 24, "sname@gmail.com")
customer1.__dir__()
print(customer1)