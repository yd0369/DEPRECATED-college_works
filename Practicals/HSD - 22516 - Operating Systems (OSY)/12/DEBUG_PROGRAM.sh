#!/bin/bash
F="abc.txt"
if [ ! -f "$F" ] 
  then echo "$F"
fi
printf "\n======\n"
test -f "$F" || echo "$F"
printf "\n======\n"
[ -f "$F" ] ||  echo "$F"