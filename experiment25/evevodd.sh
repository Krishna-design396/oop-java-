#!/bin/bash
EvenOdd()  #function definition
{
    if [ $(( $1 % 2 )) -eq 0 ]
    then
        echo "$1 is Even"
    else
        echo "$1 is Odd"
    fi
}
#main 
read -p "Enter a number: " num
EvenOdd $num   #function call

