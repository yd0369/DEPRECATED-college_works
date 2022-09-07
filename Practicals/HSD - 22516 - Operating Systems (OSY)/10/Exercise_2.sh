#!/bin/bash
if [ "$X" -nt "/etc/passwd" ] 
    then echo "X is a file which is newer than /etc/passwd";
fi