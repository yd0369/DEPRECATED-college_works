#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<math.h>
main()
{
	int x,y,z,o,x1,x2,y1,y2;
	int gd=DETECT,gm;
	initgraph(&gd,&gm,"c:\\turboc3\\bgi");
	bar3d(50,100,60,90,5,1);
	printf("Enter scaling factors :\n\n");
	printf("S [X] : ");
	scanf("%d",&x);
	printf("S [Y] : ");
	scanf("%d",&y);
	printf("S [Z] : ");
	scanf("%d",&z);
	getch();
	cleardevice();	
	printf("After scaling");
	bar3d((x*50),(y*100),(x*60),(y*90),5*z,1);
	getch();
	closegraph();
}
