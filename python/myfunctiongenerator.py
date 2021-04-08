# -*- coding: utf-8 -*-
"""
Created on Mon Jan 25 14:31:30 2021

@author: RajatShukla
"""

# def myFunctionGenerator(n):
#     result = []
#     for x in range(n):
#         result.append(x*17)
#     return result

# numbers = myFunctionGenerator(100)
# for num in numbers:
#     print(num)

def myFunctionGenerator(n):

    for x in range(n):
        yield x*4

#print(myFunctionGenerator(5))
num = myFunctionGenerator(5)
for numb in num:
    print(numb)
