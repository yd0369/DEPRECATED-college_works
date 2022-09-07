#!/bin/bash
START=0 
PREVIOUS=1  
for (( i=0; i<$1; i++ )) 
do
    printf "$START \n"
    NEXT=$((START + PREVIOUS)) 
    START=$PREVIOUS 
    PREVIOUS=$NEXT 
done