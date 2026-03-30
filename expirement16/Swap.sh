#!/bin/bash

echo "Enter first number:"
read a

echo "Enter second number:"
read b

# Swapping
temp=$a
a=$b
b=$temp

echo "After interchange:"
echo "First number = $a"
echo "Second number = $b"
