# -*- coding: utf-8 -*-
"""
Created on Mon Jan 25 15:36:57 2021

@author: RajatShukla
"""

def add(x):
    def function(y):
        return x+y
    return function

print(add(3)(4))