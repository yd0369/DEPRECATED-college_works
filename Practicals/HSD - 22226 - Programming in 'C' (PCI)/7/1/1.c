// A PROGRAM TO PRINT DAY OF WEEK BY TAKING NUMBER FROM 1 to 7
#include<stdio.h>

main() {
    int n;
    printf("ENTER DAY OF WEEK [1-7] :- ");
    scanf("%d", & n);
    switch (n) {
    case 1:
        printf("\n     MONDAY");
        break;

    case 2:
        printf("\n     TUESDAY");
        break;

    case 3:
        printf("\n     WEDNESDAY");
        break;

    case 4:
        printf("\n     THURSDAY");
        break;

    case 5:
        printf("\n     FRIDAY");
        break;

    case 6:
        printf("\n     SATURDAY");
        break;

    case 7:
        printf("\n     SUNDAY");
        break;

    default:
        printf("\n     INVALID INPUT");
    }
}