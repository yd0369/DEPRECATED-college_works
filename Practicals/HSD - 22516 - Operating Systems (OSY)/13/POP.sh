#!/bin/bash
printf "Enter File Name : "
read FILE
(chmod 777 $FILE) || printf "Failed" && printf "Successfull" 