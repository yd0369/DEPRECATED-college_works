#include<iostream>
using namespace std;
int main()
{
int a [2] [3] = {1, 2, 3, ,4, 5};
int i = 0, j = 0;
for (i = 0; i < 2; i++)
for (j = 0; j < 3; j++)
cout<<a[i][j];
}

