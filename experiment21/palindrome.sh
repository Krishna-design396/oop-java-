#!/bin/bash
read -p "Enter a number:" n
rev=0
temp=$n
while [ $n -gt 0 ]
do
    r=$((n%10))
    rev=$((rev*10+r))
    n=$((n/10))
done
if [ $temp -eq $rev ]
then
    echo "Palindrome number"
else
    echo "Not a palindrome"
fi
