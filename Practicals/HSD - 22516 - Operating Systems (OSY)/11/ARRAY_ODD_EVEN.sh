#!/bin/bash
NUMBERS="1 2 3 4 5 6 7"
for NUM in $NUMBERS 
do 
    Q=$(( $NUM % 2 ))
    if [ $Q -eq 0 ] 
      then echo "Number is an even number!!"
      continue
    fi
echo "Found odd number"
done