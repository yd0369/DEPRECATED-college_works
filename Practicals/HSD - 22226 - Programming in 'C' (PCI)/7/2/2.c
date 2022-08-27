// A PROGRAM TO PRINT STUDENT GRADE BY ACCEPTING PERCENT MARKS
#include<stdio.h>

main() {
    int n;
    float AMI, BCC, CHP, PCI, EEC, BEC, WPD, TOTAL, AVERAGE, PERCENTAGE;
    printf("Enter your Applied Mathematics (A.M.I.) Total Marks :----------------- \a");
    scanf("%f", & AMI);
    printf("Enter your Bussiness Communication (B.C.C.) Total Marks :------------- \a");
    scanf("%f", & BCC);
    printf("Enter your Computer Hardware & Pheriperals (C.H.P.) Total Marks :----- \a");
    scanf("%f", & CHP);
    printf("Enter your Programming in 'C' (P.C.I.) Total Marks :------------------ \a");
    scanf("%f", & PCI);
    printf("Enter your Elements Of Electrical Engineering (E.E.C.) Total Marks :-- \a");
    scanf("%f", & EEC);
    printf("Enter your Basic Electronics (B.E.C.) Total Marks :------------------- \a");
    scanf("%f", & BEC);
    printf("Enter your Web Page Designing (W.P.D.) Total Marks :------------------ \a");
    scanf("%f", & WPD);
    TOTAL = AMI + BCC + CHP + PCI + EEC + BEC + WPD;
    AVERAGE = TOTAL / 7;
    PERCENTAGE = (TOTAL / 700) * 100;
    printf("\n\n\nTotal Marks :- %f Out Of 700\n", TOTAL);
    printf("Average of Total Marks :- %f\n", AVERAGE);
    printf("Percentage :- %f %\n\n", PERCENTAGE);
    printf("GRADE : ");
    if (PERCENTAGE >= 90 && PERCENTAGE < 100) {
        n = 1;
    } else if (PERCENTAGE >= 80) {
        n = 2;
    } else if (PERCENTAGE >= 70) {
        n = 3;
    } else if (PERCENTAGE >= 60) {
        n = 4;
    } else if (PERCENTAGE >= 50) {
        n = 5;
    } else if (PERCENTAGE >= 40) {
        n = 6;
    } else if (PERCENTAGE >= 30) {
        n = 7;
    } else if (PERCENTAGE >= 20) {
        n = 8;
    } else if (PERCENTAGE >= 10) {
        n = 9;
    } else if (PERCENTAGE < 10) {
        n = 10;
    } else {
        n = 11;
    }
    switch (n) {
    case 1:
        printf("A1");
        break;

    case 2:
        printf("A2");
        break;

    case 3:
        printf("B1");
        break;

    case 4:
        printf("B2");
        break;

    case 5:
        printf("C1");
        break;

    case 6:
        printf("C2");
        break;

    case 7:
        printf("D1");
        break;

    case 8:
        printf("D2");
        break;

    case 9:
        printf("E1");
        break;

    case 10:
        printf("E2");
        break;

    case 11:
        printf("INVALID");
        break;
    }
}