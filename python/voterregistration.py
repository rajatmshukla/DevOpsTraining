# -*- coding: utf-8 -*-
"""
Created on Wed Jan 27 15:58:19 2021

@author: RajatShukla
"""

name = input('Enter Name : ')
age = int(input('Enter your age : '))
#age check
if age>=18:
    print("\nBJP\nCongress\nSP\nNCP")
    list = ['BJP','Congress','SP','NCP']
    #partyname check
    party = input('Enter Party Name : ')

    if party in list:
        print("Congratulation your membership is accepted in",party)
    else:
        print("Enter your party again")

    #count members
    Dict = {'BJP':0,'Congress':0,'SP':0,'NCP':0}
    if party in Dict.keys():
            Dict[party] += 1
    print(Dict)
else:
    print("Sorry you cannot join as your age is less than 18 years")
    


