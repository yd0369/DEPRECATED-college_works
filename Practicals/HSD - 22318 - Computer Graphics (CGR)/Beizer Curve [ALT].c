#include<stdio.h>
#include<graphics.h>
#include<math.h>
#include<conio.h>
int maxx,maxy;
float array[4][2];
void drawline(float x2, float y2)
{
	line(array[0][0],array[0][1],x2,y2);
	array[0][0]=x2;
	array[0][1]=y2;
}
void DrawBeizer(float xb,float yb,float xc,float yc,float xd,float yd,int n)
{
	float xab,yab,xbc,ybc,xcd,ycd;
	float xabc,yabc,xbcd,ybcd;
	float xabcd,yabcd;
	printf("%d\t",rand()%9);
	if(n==0)
	{
		drawline(xb,yb);
		drawline(xc,yc);
		drawline(xd,yd);
	}
	else
	{
		xab=(array[0][0]+xb)/2;
		yab=(array[0][1]+xb)/2;
		xbc=(xb+xc)/2;
		ybc=(yb+yc)/2;
		xcd=(xc+xd)/2;
		ycd=(yc+yd)/2;
		xabc=(xab+xbc)/2;
		yabc=(yab+ybc)/2;
		xbcd=(xbc+xcd)/2;
		ybcd=(ybc+ycd)/2;
		xabcd=(xabc+xbcd)/2;
		yabcd=(yabc+ybcd)/2;
		n=n-1;
		DrawBeizer(xab,yab,xabc,yabc,xabcd,yabcd,n);
		DrawBeizer(xbcd,ybcd,xcd,ycd,xd,yd,n);
	}
}
main()
{
	int i,gd=DETECT,gm;
	float x,y;
	clrscr();
	printf("Enter the Co-Ordinates : \n\n");
	for(i=0;i<4;i++)
	{
		printf("\nEnter the X%d : ",i+1);
		scanf("%f",&x);
		printf("\nEnter the Y%d : ",i+1);
		scanf("%f",&y);
		array[i][0]=x;
		array[i][1]=y;
	}
	initgraph(&gd,&gm,"C:\\TurboC3\\BGI");
	DrawBeizer(array[1][0],array[1][1],array[2][0],array[2][1],array[3][0],array[3][1],8);
	getch();
	getch();
	getch();
	closegraph();
	return;
}
