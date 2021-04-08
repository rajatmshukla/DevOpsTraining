package com.myapp.groovy.main
import com.myapp.groovy.MyAccount


def account1=new MyAccount(balance:100.00);
account1.deposit(400)
def account2=new MyAccount(balance:500.00);
account2.withdraw(200)
println account1
println account1+account2
println account1-account2