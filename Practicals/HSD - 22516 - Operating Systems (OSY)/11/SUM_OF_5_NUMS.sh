#!/bin/bash
SUM="0"
for ((i = 1 ; i < 6 ; i++)) do
    read A
    SUM=$((SUM + A))
done
printf "SUM : $SUM\n\n\n"
