# -*- coding: utf-8 -*-
"""preferred 
Created on Thu Jan 28 18:29:10 2021

@author: RajatShukla
"""
import csv

print("\n\tWelcome to the Store")
print("\n\tLet's fill your cart today!")
list = ['Shoe','Sock','Bag','Bottle']
print(list)
while True: 
	try: 
		ch = int(input("1.ADD\n2.EXIT\nEnter your choice : ")) 
	except ValueError: 
		print("\nERROR: Choose only digits from the given option") 
		continue
	else: 
		if ch == 1:
                name = input('Enter Product Name : ')

                    if name in list:
                        with open('data1.csv') as csvfile:
                            reader = csv.DictReader(csvfile)
                            for row in reader:
                                while (name == row["Product"]):
                                        print(row["Brand"])
                                        break
                                            brand = input('Enter Brand Name : ')
                                            if brand in row["Brand"]:
                                            qty = int(input('Enter Quantity : '))
                                            while (brand==row["Brand"] and int(row["Qty"])>=qty):
                                                total = qty*int(row["Price"])
                                                print("Total Price is :",total)
                                                break
                                        else:
                                            print("Required quantity not in Stock")

                    else:
                        print("invalid input try again")
                    
else:
     print("Enter again")

                        