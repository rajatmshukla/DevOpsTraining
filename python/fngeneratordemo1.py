# -*- coding: utf-8 -*-
"""
Created on Mon Jan 25 15:06:11 2021

@author: RajatShukla
"""

def myFunctionGenerator(n):
    
    for x in range(n):
        yield x*4
        
gen = myFunctionGenerator(3)
print(next(gen))
print(next(gen))
print(next(gen))
