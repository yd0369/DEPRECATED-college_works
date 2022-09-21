#include <stdio.h>
#include <stdlib.h>
#include <graphics.h>
#include <math.h>
 
void main()
{
    int i,x[4], y[4];
    int gd = DETECT, gm;
    double t;
    printf ("Enter the coordinates of the four control points.\n");
    for (i=0; i<4; i++)
    {
    	printf("\n\nX%d : ",i+1);
		scanf ("%d", &x[i]);
		printf("Y%d : ",i+1);
		scanf ("%d", &y[i]); 
	}
	initgraph (&gd, &gm, "..\\bgi");
    for (t = 0; t < 1; t += 5/10000)
    {
		double xt = pow (1-t, 3) * x[0] + 3 * t 
				  * pow (1-t, 2) * x[1] + 3 * 
				  	pow (t, 2) * (1-t) * x[2] +
				    pow (t, 3) * x[3];
	 
		double yt = pow (1-t, 3) * y[0] + 3 * t
				  * pow (1-t, 2) * y[1] + 3 *
				  	pow (t, 2) * (1-t) * y[2] +
					pow (t, 3) * y[3];
		putpixel (xt, yt, WHITE);
    }
 
    for (i=0; i<4; i++)
    {
		putpixel (x[i], y[i], YELLOW);
	}
	getch();
    closegraph();
    return;
    
}
