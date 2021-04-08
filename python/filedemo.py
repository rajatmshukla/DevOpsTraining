# -*- coding: utf-8 -*-
"""
Created on Wed Jan 27 09:36:11 2021

@author: RajatShukla

different modes 

r
w
a
w+
a+ = append and read
x
"""

fileStream = open('data.txt','a')

str = input("enter the data that can be stored in test")

fileStream.write(str)

fileStream.close()