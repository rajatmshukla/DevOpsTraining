package com.myapp.groovy.main
import com.myapp.groovy.customer.Customer;

def customer=new Customer(first:'Sachin',last:'Tendulkar',age:47,since:new Date(),favItems:['Cricket','Books']); 
def customer1=new Customer(first:'Sachin',last:'Tendulkar',age:47,since:new Date(),favItems:['Cricket','Books']);

println customer == customer1
println customer

