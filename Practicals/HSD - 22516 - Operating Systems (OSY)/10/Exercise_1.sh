#!/bin/bash
if ! [ -r "$1" ] 
    then echo "File $1 is not readable -skipping.";
fi