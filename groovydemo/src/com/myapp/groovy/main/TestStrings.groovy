package com.myapp.groovy.main

char c ='c'
println c.class

String str='Some String';
println str.class 
String name="Name1"
String msg="Hello "+name+"!"
println(msg)

String msg2="Hello ${name} !"
println(msg2)

def multiLineString="""
a
msg
goes
here
and Hello
from ${name}
"""
println(multiLineString)