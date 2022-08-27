#include<stdio.h>

void main() {
    int n1, n2, result;
    int c;
    printf("\n1.Addition\n2.subtraction\n3.Multiplication\n4.Division\n5.modulo\n6.square\n7.cube");
    printf("\n Enter your choice");
    scanf("%d", & c);
    printf("\n Enter any two number");
    scanf("%d%d", & n1, & n2);

    switch (c) {
    case 1: {
        result = n1 + n2;
        printf("\n Addition of two number is=%d", result);
    }
    break;
    case 2: {
        result = n1 - n2;
        printf("\n Subtraction of two number is=%d", result);
    }
    break;
    case 3: {
        result = n1 * n2;
        printf("\n multiplication of two number is=%d,result");
    }
    break;
    case 4: {
        result = n1 / n2;
        printf("\n Division of two number is=%d,result");
    }
    break;
    case 5: {
        result = n1 %= n2;
        printf("\n Modulo of two number is=%d,result");
    }
    break;
    case 6: {
        result = n1 * n1;
        printf("\n enter one num is=%d,result ");
        printf("\n square of number is=%d,result");
    }
    break;
    case 7: {
        result = n1 * n1 * n1;
        printf("\n cube of number is=%d,result");
    }
    break;

    }
}