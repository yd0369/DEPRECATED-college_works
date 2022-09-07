#!/bin/bash
printf "Enter File Name : "
read FILE
if [ ! -f $FILE ]
then
    printf "File $FILE does not exists\n"
else
   printf "\n\n1. COPY\n2. REMOVE\n3. RENAME\n"
   read SELECTION
   case $SELECTION in 
        1) printf "Enter Destination : "
           read DESTINY
           cp $FILE $DESTINY
           ;;
        2) rm $FILE
           ;;
        3) printf "Enter New Name : "
           read N_NAME
           mv $FILE $N_NAME
           ;;
    esac
fi