#!/bin/bash
for ((i = 2 ; i < 11 ; i++)) do
    for ((j = 1 ; j < 11 ; j++)) do
        printf "$i * $j = $(($i * $j))\n"
    done
    printf "==============\n"
done