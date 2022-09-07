#!/bin/bash
for((x=0; x<4; x++)) do 
    for((space=0;space<=x;space++))
    do printf " "
    done
    for((ya=x;ya<3;ya++))
    do printf "*"
    done
    for((yb=x;yb<3;yb++))
    do printf "*";
    done
    if((x>2)) 
        then printf "*"
    fi
    printf "\n";
  done
