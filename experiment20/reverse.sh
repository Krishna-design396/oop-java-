#!/bin/bash
read -p "Enter a five digit number: " n
rev=0
while [ $n -gt 0 ]
do
    r=$((n%10))
    rev=$((rev*10+r))
    n=$((n/10))
done
echo "Reversed number = $rev"

