# -*- coding: utf-8 -*-
"""
Created on Wed Jan 27 09:57:48 2021

@author: RajatShukla
"""

fileStream = open('data.txt','r')

str = fileStream.read()

print(str)

fileStream.close()