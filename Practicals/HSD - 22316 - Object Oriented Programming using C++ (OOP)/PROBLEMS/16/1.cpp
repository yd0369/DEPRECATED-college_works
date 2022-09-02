#include<iostream>
using namespace std;
class Distance
{
private:
int feet;
int inches;
public:
//required constructors
Distance()
{
feet = 0;
inches = 0;
}
Distance (int f, int i)
{
feet = f;
inches = i;
}
void displayDistance()
{
cout << "F: << feet << I:" << inches <<endl;
}
//overloaded minus operator
Distance operator-()
{feet = -feet;
inches -inches;
return Distance (feet, inches);
}
};
main()
{
Distance D1 (11, 10), D2 (-5, 11);
-D1;
D1.displayDistance();
-D2;
D2.displayDistance();
}
