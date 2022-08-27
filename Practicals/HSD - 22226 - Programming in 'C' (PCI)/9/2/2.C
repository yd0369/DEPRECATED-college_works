#include<stdio.h>

main() {
    int x, y, z;
    printf("ENTER THE NUMBER [1-5] :-");
    scanf("%d", & x);
    for (y = 1; y <= 10; y++) {
        z = x * y;
        printf("  %d X %d = %d\n", x, y, z);
    }
}