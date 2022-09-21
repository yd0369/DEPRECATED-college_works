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
	printf("Enter rotating angle : ");
	scanf("%d",&o);
 	x1=50*cos(o*3.14/180)-100*sin(o*3.14/180);
 	y1=50*sin(o*3.14/180)+100*cos(o*3.14/180);
 	x2=60*cos(o*3.14/180)-90*sin(o*3.14/180);
 	y2=60*sin(o*3.14/180)+90*cos(o*3.14/180);
 	getch();
	cleardevice();
	printf("After rotation about z axis : ");
	bar3d(x1,y1,x2,y2,5,1);
	getch();
	cleardevice();
	printf("After rotation about x axis : ");
	bar3d(50,x1,60,x2,5,1);
	getch();
	cleardevice();
	printf("After rotation about y axis : ");
	bar3d(x1,100,x2,90,5,1);
	getch();
	closegraph();
}
