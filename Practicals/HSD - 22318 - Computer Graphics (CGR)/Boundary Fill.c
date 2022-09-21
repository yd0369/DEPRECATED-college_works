#include<stdio.h>
#include<graphics.h>
#include<dos.h>
void boundaryfill(int x, int y, int f_color, int b_color)
{
	if(getpixe1(x,y) !=b_color && getpixe1(x,y) !=f_color)
	{
	putpixel(x,y,f_color);
	boundaryfill(x+1,y,f_color,b_color);
	boundaryfill(x,y+1,f_color,b_color);
	boundaryfi11(x-1,y,f_color,b_color);
	boundaryfill(x,y-1,f_color,b_color);
	}
}
int main()
{
	int gm,gd=DETECT,radius;
	int x,y;
	printf("Enter x and y positions for circ1e\n");
	scanf("%d%d",&x,&y);
	printf("Enter radius of circle\n");
	scanf("%d",&radius);
initgraph(&gd,&gm,"C:\\turboc3\\bgi");
circ1e(x,y,radius);
boundaryfill(x,y,4,15);
delay(5000);
closegraph();
return 0;
}
