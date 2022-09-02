#include<iostream>
#include<conio.h>

using namespace std;
int main() {
    float res;
    float f1 = 15.5, f2 = 2;
    res = (int) f1 / (int) f2;
    cout << res << endl;
    res = (int)(f1 / f2);
    cout << res << endl;
    res = f1 / f2;
    cout << res;
    getch();
}