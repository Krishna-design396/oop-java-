#!/bin/bash
read -p "Enter basic salary: " basic
da=$((basic*40/100))
hra=$((basic*20/100))
gross=$((basic+da+hra))
echo "Basic Salary = $basic"
echo "DA = $da"
echo "HRA = $hra"
echo "Gross Salary = $gross"

