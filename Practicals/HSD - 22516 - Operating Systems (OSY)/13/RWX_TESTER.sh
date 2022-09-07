#!/bin/bash
printf "Enter File Name : "
read FILE
printf "$FILE is "
if [ -r $FILE ] 
then printf "R" 
else printf "_"
fi
if [ -w $FILE ] 
then printf "W"
else printf "_"
fi
if [ -x $FILE ] 
then printf "X"
else printf "_"
fi