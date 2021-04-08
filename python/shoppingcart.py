# -- coding: utf-8 --
"""
Created on Sat Jan 30 15:58:25 2021

@author: RajatShukla
"""

import csv


a ={"Product":[], 
    "Brand":[], 
    "Quantity":[], 
    "Total":[]} 

b = list(a.values()) 

pro = b[0]

br = b[1] 

qu = b[2]

to = b[3]
dlist=[]
dlist1=[]
brandlist=[]

with open('data1.csv') as csvfile:
    reader = csv.DictReader(csvfile)
    for row in reader:
        dlist.append(row)
    dlist1=dlist
    print("\n\tWelcome to the Store")
    print("\n\tLet's fill your cart today!")
    list = ['Shoe','Sock','Bag','Bottle']
    print('\nShoe\nSock\nBag\nBottle')

    while True: 
    	try: 
    		ch = int(input("1.ADD PRODUCT\n2.EXIT\n\nEnter your choice : ")) 
    	except ValueError: 
    		print("\nERROR: Choose only digits from the given option") 
    		continue
    	else:
             if ch == 1:
                name = input('Enter Product Name : ')   
                for row in dlist1:
                        if name == row["Product"]:
                            for i in dlist:
                                if name == i["Product"]:
                                    s = (i["Brand"])
                                    brandlist.append(s)
                                    print(s)
                                    
                            
                            
                            brand = input('Enter Brand Name : ');
                            
                            if brand in brandlist:
                                qty = int(input('Enter Quantity : '))
                                
                                if (brand  in brandlist and int(row["Qty"])>=qty):
                                    total = qty*int(row["Price"])
                                    print("\nPrice Is: ",row["Price"])
                                    print("\nTotal Price Is:",total)
                                    pro.append(name)
                                    br.append(brand)
                                    qu.append(qty)
                                    to.append(total)
                                    break
                                else:
                                    print("Required quantity not in Stock\n")
                                    break
             elif (ch == 2):
                     print("\nTHANK YOU FOR SHOPPING WITH US!!\n")
                     print(pro)
                     print(br)
                     print(qu)
                     print(to)
                     print("\nYOUR FINAL BILL IS: Rs", sum(to))
                     break