#include<stdio.h>
#include<conio.h>

main() {
  printf("\n\n   <<<<<<<<<<<<<<................WELCOME.................>>>>>>>>>>>>>>>>>\n\n       This Program Find the type of Triangle  on the basis of\n                   magnitude/input of sizes of triangle. \n\n\n ______________________________________________________________________________");
  int a, b, c, n;
  printf("\n\n Enter the First Side value (a):-   ");
  scanf("%d", & a);
  printf("\n Enter the First Side value (b):-   ");
  scanf("%d", & b);
  printf("\n Enter the First Side value (c):-   ");
  scanf("%d", & c);

  do {
    printf("______________________________________________________________________________\n                    <<<<<<<<<<<<<<  MENU  >>>>>>>>>>>>\n______________________________________________________________________________\n");
    printf("\n\n\n1.Check whether the triangle is an ISOSCELES TRIANGE. \n\n2.Check whether the triangle is an EQUILATERAL TRIANGE. \n\n3.Check whether the triangle is an SCALENE TRIANGE. \n\n4.Check whether the triangle is an RIGHT ANGLED TRIANGE. \n\n5.EXIT THE PROGRAM");
    printf("\n\n\nCHOOSE FROM THE FOLLOWING OPTIONS [1-5]:-");
    scanf("%d", & n);
    printf("______________________________________________________________________________\n                                       MENU\n______________________________________________________________________________\n");

    switch (n) {
    case 1:
      if (a == b && b == c) {
        printf("\n\n The triangle is an ISOSCELES TRIANGE.  ");
      } else {
        printf("\n\n The triangle is NOT an ISOSCELES TRIANGE.  ");
      }
      break;

    case 2:
      if (a == b || b == c || c == a) {
        printf("\n\n The triangle is an EQUILATERAL TRIANGE.  ");
      } else {
        printf("\n\n The triangle is NOT an EQUILATERAL TRIANGE.  ");
      }
      break;

    case 3:
      if (a != b && b != c && c != a) {
        printf("\n\n The triangle is a SCALENE TRIANGE.  ");
      } else {
        printf("\n\n The triangle is NOT a SCALENE TRIANGE.  ");
      }
      break;

    case 4:
      if (a > b && a > c) {
        if ((a * a) == (b * b) + (c * c)) {
          printf("\n\n The triangle is a RIGHT ANGLED TRIANGE.  ");
        }
      } else if (b > a && b > c) {
        if ((b * b) == (a * a) + (c * c)) {
          printf("\n\n The triangle is a RIGHT ANGLED TRIANGE.  ");
        }
      } else if (c > a && c > b) {
        if ((c * c) == (b * b) + (a * a)) {
          printf("\n\n The triangle is a RIGHT ANGLED TRIANGE.  ");
        }
      } else {
        printf("\n\n The triangle is NOT a RIGHT ANGLED TRIANGE.  ");
      }
      break;
    }
  }
  while (a != 5);
}