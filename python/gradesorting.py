# -*- coding: utf-8 -*-
"""
Created on Wed Jan 27 15:35:26 2021

@author: RajatShukla
"""

number1 = int(input('Enter First grade : '))
number2 = int(input('Enter Second grade : '))
number3 = int(input('Enter Third grade : '))
number4 = int(input('Enter fourth grade : '))

list = [number1,number2,number3,number4]

list.sort()

print("largest grade is: ",list[3])
print("Smallest grade is: ",list[0])

