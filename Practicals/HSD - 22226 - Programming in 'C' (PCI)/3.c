#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<string.h>

void add_book();
void disp_book();
void book_auth();
void count_book();

struct lib {
    int acc_no;
    char book_title[20];
    char author[20];
    int cost;
}
b[100];
int count;
main() {
    int ch;
    while (1) {
        printf("\n 1:enter the book info\n");
        printf("\n 2:display book info\n");
        printf("\n 3:book author\n");
        printf("\n 4:count book\n");
        printf("\n 5:exit\n");
        printf("\n enter the choice \n");
        scanf("%d", & ch);
        switch (ch) {
        case 1:
            add_book();
            getch();
            break;
        case 2:
            disp_book();
            getch();
            break;
        case 3:
            book_auth();
            getch();
            break;
        case 4:
            count_book();
            getch();
            break;
        case 5:
            exit(0);
        }
    }
}
//-----------------------------------
void add_book() {
    if (count == 9) {
        printf("\n no more space\n");
        return;
    }
    printf("\n enter the detail of book \n");
    printf("\n enter accession number of book =");
    scanf("%d", & b[count].acc_no);
    fflush(stdin);
    printf("\n enter the book title=");
    gets(b[count].book_title);
    fflush(stdin);
    printf("\n enter the name of author=");
    gets(b[count].author);
    fflush(stdin);
    printf("\n enter the cost of book=");
    scanf("%d", & b[count].cost);
    count++;
}
//*********
void disp_book() {
    int i;
    printf("\n detail of %d booksin library", count);
    for (i = 0; i < count; i++) {
        printf("\n %d\n%s\n%s\n%d", b[i].acc_no, b[i].book_title, b[i].author, b[i].cost);
    }
}
//*******
void book_auth() {
    int i, cnt = 0;
    char name[20];
    printf("\n enter the name of author=");
    gets(name);
    for (i = 0; i < count; i++) {
        if (strcmp(name, b[i].author) == 0) {
            cnt++;
            printf("\n %d\n%s\n%s\n%d", b[i].acc_no, b[i].book_title, b[i].author, b[i].cost);
        }
    }
    if (cnt == 0)
        printf("\n no such book \n");
}
//***********
void count_book() {
    printf("\n total no of book in library =%d", count);
}