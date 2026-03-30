#!/bin/bash
read -p "Enter number of rows:" n
for ((i=1; i<=n; i++))
do
    for ((j=i; j<n; j++))
    do
        echo -n " "  #output on the same line & is used to create left spacing
    done
    for ((j=1; j<=i; j++))
    do
        echo -n "* "  #prints a star with a space on the same line
    done
    echo #prints a newline and moves the cursor to the next row
done

