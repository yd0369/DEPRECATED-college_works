#!/bin/bash
for FILE in $(ls $pwd) 
    do 
    if [ -x $FILE ] 
    then printf "$FILE \n"
    fi
done