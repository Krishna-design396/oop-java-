#!/bin/bash 
read -p "Enter number of rows: " n 
num=1
for ((i=1; i<=n; i++))
do
    for ((j=1; j<=i; j++))
    do
        echo -n "$num " # prints the value of num followed by a space on the same line
        ((num++))
    done
    echo
done

