#include<stdio.h>

#include<string.h>

main() {
  int n;
  char a[10];
  char JAN[10] = {
    "JANUARY"
  }, FEB[10] = {
    "FEBRUARY"
  }, MAR[10] = {
    "MARCH"
  };
  char APR[10] = {
    "APRIL"
  }, MAY[10] = {
    "MAY"
  }, JUN[10] = {
    "JUNE"
  };
  char JUL[10] = {
    "JULY"
  }, AUG[10] = {
    "AUGUST"
  }, SEP[10] = {
    "SEPTEMBER"
  };
  char OCT[10] = {
    "OCTOBER"
  }, NOV[10] = {
    "NOVEMBER"
  }, DEC[10] = {
    "DECEMBER"
  };
  printf("ENTER INPUT IN CAPITAL LETTERS [JANUARY-DECEMBER] :-");
  gets(a);

  if (strcmp(a, JAN) == 0 || strcmp(a, FEB) == 0 || strcmp(a, MAR) == 0) {
    n = 1;
  } else if (strcmp(a, APR) == 0 || strcmp(a, MAY) == 0 || strcmp(a, JUN) == 0) {
    n = 2;
  } else if (strcmp(a, JUL) == 0 || strcmp(a, AUG) == 0 || strcmp(a, SEP) == 0) {
    n = 3;
  } else if (strcmp(a, OCT) == 0 || strcmp(a, NOV) == 0 || strcmp(a, DEC) == 0) {
    n = 4;
  } else {
    printf("\n\n\n\n           Invalid Input");
  }

  switch (n) {

  case 1:
    printf("\n\n\n\n           SPRING");
    break;

  case 2:
    printf("\n\n\n\n           SUMMER");
    break;

  case 3:
    printf("\n\n\n\n           RAINY SEASON");
    break;

  case 4:
    printf("\n\n\n\n           WINTER");
    break;
  }

}