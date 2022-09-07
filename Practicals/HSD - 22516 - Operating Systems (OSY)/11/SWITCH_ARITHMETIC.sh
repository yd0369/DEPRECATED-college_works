#!/bin/bash
A=$1 B=$3
case $2 in 
  +) echo "ADD = $(($A + $B))"  ;;
  -) echo "SUB = $(($A - $B))"  ;;
  /) echo "DIV = $(($A / $B))"  ;;
  %) echo "MOD = $(($A % $B))"  ;;
  *) echo "MUL = $(($A * $B))"  ;;
esac
