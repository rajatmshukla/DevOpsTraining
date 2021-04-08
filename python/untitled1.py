
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


print("\n\tWelcome to the Store")
print("\n\tLet's fill your cart today!")
list = ['Shoe','Sock','Bag','Bottle']
print('\nShoe\nSock\nBag\nBottle')


while True: 
	try: 
		ch = int(input(" 1.ADD PRODUCT\n 2.EXIT\n\nEnter your choice : ")) 
	except ValueError: 
		print("\nERROR: Choose only digits from the given option") 
		continue
	else:
         if ch == 1:
            name = input('Enter Product Name : ')
            with open('data1.csv') as csvfile:
                reader = csv.DictReader(csvfile)
                for row in reader:
                    if name == row["Product"]:
                        s = row["Brand"]
                        print(s)
         elif ch == 2:
            break
                        
                    