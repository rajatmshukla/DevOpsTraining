# -*- coding: utf-8 -*-
"""
Created on Fri Jan 22 15:55:01 2021

@author: RajatShukla
"""

def myFunc(*args):
    print(args)
    #print(type(args))
    for arg in args:
        print(arg)
    
myFunc(1,2,3,4,5,6,7,"Py","NodeJs","Js")

def newFunc(**kwargs):
    # print(kwargs)
    # print(type(kwargs))
    for key,value in kwargs.items():
        print("key: ",key,"\t\t", "Value: "+value)
    
newFunc(name='Somename',company='IBM',learning='Elearning')
    
def order(name, *dishes, **kwargs):
    print(f"Hello {name}")
    for dish in dishes:
        print(f"\t you ordered {dish}")
    if kwargs.get("address"):
        address=kwargs.get("address")
        print(f"\t we are delivering to {address}")
        
        
order("Rajat", "Noodles", "Sauce", addres='nagpur')
    
    