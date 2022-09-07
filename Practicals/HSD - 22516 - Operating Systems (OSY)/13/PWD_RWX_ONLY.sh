#!/bin/bash
for FILE in $(ls $pwd) 
    do 
    if [ -r $FILE ] && [ -w $FILE ] && [ -x $FILE ]
    then printf "$FILE \n"
    fi
done