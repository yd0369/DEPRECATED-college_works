#!/bin/bash
A="190"
B="120"
C="30"
if ((A > B))
        then if ((A > C))
                then printf "A is Greatest\n"
                else printf "C is Greatest\n"
             fi
else if ((B > C))
        then printf "B is Greatest\n"
        else printf "C is Greatest\n"
    fi
fi