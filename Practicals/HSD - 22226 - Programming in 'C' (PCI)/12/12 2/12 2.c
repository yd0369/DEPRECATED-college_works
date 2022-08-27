#include <stdio.h>

struct Distance {
    int km;
    float m;
}
d1, d2, sum;
int main() {
    printf("Enter information for 1st distance\n");
    printf("Enter km m: \n");
    scanf("%d%f", & d1.km, & d1.m);
    printf("\nEnter information for 2nd distance\n");
    printf("\nEnter km m: \n");
    scanf("%d%f", & d2.km, & d2.m);
    sum.km = d1.km + d2.km;
    sum.m = d1.m + d2.m; {
        sum.m = sum.m - 12.0;
        ++sum.km;
    }
    printf("\nSum of distances = %d.%f", sum.km, sum.m);
}