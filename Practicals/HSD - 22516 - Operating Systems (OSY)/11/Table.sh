#!/bin/bash
for ((i = 1 ; i < 11 ; i++)); do
  printf "$i X $1 = $(($i * $1))\n"
done