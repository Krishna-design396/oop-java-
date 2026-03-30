#!/bin/bash
read -p "Enter number of rows:" n
for ((i=n; i>=1; i--))
do
    for ((j=1; j<=i; j++))
    do
        echo -n "* " #prints a star with a space on the same line
    done
    echo #prints a newline and moves the cursor to the next row
done
