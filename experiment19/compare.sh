#!/bin/bash
read -p "Enter first number: " a
read -p "Enter second number: " b
if [ $a -lt $b ]
then
    echo "$a is smaller than $b"
    sum=$((a+b))
    echo "Sum = $sum"
elif [ $a -gt $b ]
then
    echo "$a is greater than $b"
    mul=$((a*b))
    echo "Multiplication = $mul"
else
    echo "$a and $b are equal"
fi
