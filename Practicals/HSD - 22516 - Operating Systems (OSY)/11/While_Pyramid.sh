#!/bin/bash
i=1 j=1
while ((i <= 5)); do
  while ((j <= i)); do
    printf "*"
	j=$((j + 1))
  done
  printf "\n"
  i=$((i + 1)) j=1 
done