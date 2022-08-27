// A PROGRAM TO CALCULATE SUM OF 5-DIGIT NUMBER WITH MODULUS OPERATER
#include<stdio.h>
main()
{ 
    int n[5]; 
	printf("ENTER VALUE OF N :- ");
	scanf("%d",&n);
    n[1]=n%10;
    n=n/10;
    n[2]=n%10;
    n=n/10;
    n[3]=n%10;
    n=n/10;
    n[4]=n%10;
    n=n/10;
    n[5]=n%10;
    n=n/10;
	printf("\nSUM OF THE VALUES :- %d",n);
}
