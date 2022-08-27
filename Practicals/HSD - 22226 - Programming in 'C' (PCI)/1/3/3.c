// A PROGRAM TO INTERCHANGE CONTENTS OF C AND D VARIABLES
#include<stdio.h>
main()
{
	float C,D,TEMPRORARY;
	printf("ENTER VALUE OF C :- ");
	scanf("%f",&C);
	printf("ENTER VALUE OF D :- ");
	scanf("%f",&D);
	printf("\n\n\nTHE VALUES BEFORE INTERCHANGE :-\nC - %f\nD - %f",C,D);
	TEMPRORARY=C;
	C=D;
	D=TEMPRORARY;
	printf("\nTHE VALUES AFTER INTERCHANGE :-\nC - %f\nD - %f",C,D);
}
