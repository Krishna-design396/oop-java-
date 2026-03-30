#!/bin/bash
add()  #function definition
{
    sum=$(( $1 + $2 ))   #$1 – 1st argument & $1 – 2nd argument
    echo "Sum = $sum"
}
#main 
read -p " Enter two numbers: " a b
add $a $b  #function call
