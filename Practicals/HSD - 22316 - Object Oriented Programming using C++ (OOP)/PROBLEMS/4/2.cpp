#include<iostream>

using namespace std;
int main {
    int array[10] = {
        0,
        2,
        4,
        6,
        7,
        5,
        3
    };
    int n, result = 0;
    for (n = 0; n < 8; n++) {
        result += array[n];
    }
    cout << result;
}