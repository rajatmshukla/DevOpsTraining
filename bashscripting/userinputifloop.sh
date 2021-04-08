#!/bin/bash
echo "Enter A Number"
read num
if [ $num -lt 10 ]
then
    echo "Your num is $num and >10 "
elif [ $num -lt 20 ]
then
    echo "Your num is $num and >20 "
else
    echo "Your num is $num is not recog "

fi
