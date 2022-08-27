// A PROGRAM TO FIND AREA AND VOLUME OF A SPHERE
#include<stdio.h>
main()
{
	float radius,circumference,area,volume,P=3.14;
	printf("ENTER RADIUS OF THE CIRCLE :- ");
	scanf("%f",&radius);
	
	circumference=2*P*radius;
	area=P*radius*radius;
	volume=(4/3)*P*radius*radius*radius;
	
	printf("\nRESULT-\n\nCIRCUMFERENCE OF CIRCLE :- %f \nAREA OF CIRCLE :- %f \nVOLUME OF CIRCLE :- %f",circumference,area,volume);
}
