package com.myapp.groovy

def customer=new Customer(first:'Washington',last:'Sundar',age:21,since:new Date(),
	favItems:['Cricket','Books']);
def customer1=new Customer(first:'Rishabh',last:'Pant',age:24,since:new Date(),
	favItems:['Cricket','Books']);
def customer2=new Customer(first:'Shardul',last:'Thakur',age:24,since:new Date(),
	favItems:['Cricket','Books']);
def players=[customer1,customer,customer2]
println players.sort({c,c1-> c.last.compareTo(c1.last)})
