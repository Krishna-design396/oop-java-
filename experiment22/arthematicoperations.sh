#!/bin/bash
read -p "Enter first number: " a
read -p "Enter second number: " b
echo "Select operation:"
echo "1. Addition"
echo "2. Subtraction"
read -p "Enter option: " ch
case $ch in
1) result=$((a+b))
   echo "Addition = $result"
   ;;
2) result=$((a-b))
   echo "Subtraction = $result"
   ;;
*) echo "Invalid choice"
   ;;


