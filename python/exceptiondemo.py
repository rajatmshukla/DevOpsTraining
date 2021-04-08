# -*- coding: utf-8 -*-
"""
Created on Mon Jan 25 12:27:38 2021

@author: RajatShukla

try{}catch()
except - grace
finally - closing of resources

generic exception should be the last one 
"""
user ={'name':'Some name'}

try: 
    name=user['name1']
    
except ZeroDivisionError as e:
    print(type(e))
    print("exception in specific",e)
    
except Exception as e:
    print(type(e))
    print("exception in generic",e)
    
finally:
    print("user[name1]")
    
    
print("After key error")

