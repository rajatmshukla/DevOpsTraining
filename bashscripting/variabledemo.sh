#!/bin/bash

var1="Hello World"  #no spaces allowed
echo $var1

num1=17             #no spaces allowed
((result=($num1/7))) #no spaces allowed put brackets for BODMAS RULE 
echo $result
echo $num1/7 | bc 
echo $num1/7 | bc -l