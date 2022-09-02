////////////////////////////////////////////
//  O.O.P. PRACTICAL 17 -[ Question 3 ]   //
//         --  AREA OF SHAPES  --         //
//      -- Function Overloading --        // 
//              YASH DESAI                //
////////////////////////////////////////////
#include<iostream>

using namespace std;

void AREA(double A) {
    cout << "\nArea of Square : " << (A * A);
    cout << "\nArea of Circle : " << (A * A * 3.14);
}
void AREA(double A, double B) {
    cout << "\nArea of Triangle : " << (A * B) / 2;
    cout << "\nArea of Rectangle : " << (A * B);
}

main() {
    double A, B;
    cout << "[For (Square - Side Size [A])]\n"
    "[For (Circle - Radius Size [A])]\n"
    "[For (Triangle - Heigth Size [A],Base Size [B])]\n"
    "[For (Rectangle - Breadth Size [A],Length Size [B])]\n\n"
    "Enter the Values : \n";
    cout << "A : ";
    cin >> A;
    cout << "B : ";
    cin >> B;
    cout << endl;
    AREA(A);
    AREA(A, B);
}