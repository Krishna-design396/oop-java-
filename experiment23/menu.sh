#!/bin/bash
read -p "Enter a number: " n
echo "1. Sum of digits"
echo "2. Reverse of number"
read -p "Enter your choice:" ch
case $ch in
1)
    sum=0
    temp=$n
    while [ $temp -gt 0 ]
    do
        r=$((temp%10))
        sum=$((sum+r))
        temp=$((temp/10))
    done
    echo "Sum of digits = $sum"
    ;;
2)
    rev=0
    temp=$n
    while [ $temp -gt 0 ]
    do
        r=$((temp%10))
        rev=$((rev*10+r))
        temp=$((temp/10))
    done
    echo "Reverse = $rev"
    ;;
*)
    echo "Invalid choice"
    ;;
esac

