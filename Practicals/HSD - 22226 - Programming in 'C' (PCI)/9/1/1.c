//A PROGRAM WHICH CALCULATE SUM OF DIGITS OF A GIVEN NUMBER
#include<stdio.h>

main() {
    int INPUT, REMAINDER, SUM;
    SUM = 0;
    printf("Enter the number:-");
    scanf("%d", & INPUT);
    while (INPUT > 0) {
        /*******************************************************/
        REMAINDER = INPUT % 10;

        //FIND THE LAST DIGIT 

        /*	>>EXPLANATION:-INPUT=12345,then by modulus operator 
	                   the INPUT value will be only 5
	                   and will be assigned to REMAINDER
/*******************************************************/
        SUM = SUM + REMAINDER;

        //FIND THE SUM BY ADDING REMAINDER VALUE
        /*******************************************************/
        INPUT = INPUT / 10;
    }
    printf("SUM of the digits of number:-%d", SUM);
}