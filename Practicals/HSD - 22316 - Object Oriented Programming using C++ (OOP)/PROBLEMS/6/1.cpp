#include<iostream>
using namespace std;
class Empty{};
int main()
{
Empty a, b;

if (a == b)
cout << "impossible" <<endl;
else 
cout << "Fine" << endl;
}
