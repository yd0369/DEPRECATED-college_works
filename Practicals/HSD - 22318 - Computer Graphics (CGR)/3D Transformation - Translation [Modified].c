#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<math.h>
main()
{
	int x,y,z,o,x1,x2,y1,y2;
	int gd=DETECT,gm;
	initgraph(&gd,&gm,"c:\\turboc3\\bgi");
	bar3d(50,100,60,90,10,1);
	printf("Enter Translation Factor : \n\n");
	printf("TF [X] : ");
	scanf("%d",&x);
	printf("TF [Y] : ");
	scanf("%d",&y);
	getch();
	cleardevice();
	printf("After translation:");
	bar3d((x+50),(y+100),(x+60),(y+90),10,1);
	getch();
	closegraph();
}


