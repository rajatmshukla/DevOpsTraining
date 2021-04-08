# -*- coding: utf-8 -*-
"""
Created on Mon Jan 25 15:36:57 2021

@author: RajatShukla
"""

# def add(x):
#     def function(y):
#         return x+y
#     return function

# print(add(3899)(433))
import re
data = [7,8,9,10]

#using normal function
def mul(n): 
    return n*4
result = map(mul, data)
 
print(list(result))


#using lambda function
res = map(lambda x: x*4, data)

print(list(res))

replace="#"
name = "python, Java Sql NodeJS pasdcn python ,for data sciencepdddun"
# if "Python" in name:
#     print("Python Found")
    
pattern = r"!"

#print(re.search(pattern,name))

print(re.sub(pattern,replace,name))















    
    
    
    
    
    
    
    
    
    