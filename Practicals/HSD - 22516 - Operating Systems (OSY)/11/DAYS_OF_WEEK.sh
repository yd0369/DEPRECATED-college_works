#!/bin/bash
Days=('Mon' 'Tues' 'Wednes' 'Thurs' 'Fri' 'Satur' 'Sun')
for D in "${Days[@]}"; do
  printf "$D"
  printf "day\n"
done