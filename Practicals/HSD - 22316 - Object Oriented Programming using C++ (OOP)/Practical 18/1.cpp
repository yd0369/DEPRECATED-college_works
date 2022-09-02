////////////////////////////////////////////
//  O.O.P. PRACTICAL 18 -[ Question 1 ]   //
//      --  Interchanging Values  --      //
//       -- Function Overloading --       // 
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>

using namespace std;

void INTERCHANGE(int A, int B) {
    cout << "\n\nSWAPPING INTEGERS\n\n";
    int tmp;
    tmp = A;
    A = B;
    B = tmp;
    cout << endl << "After Swapping :\n"
    "A : " << A << "\nB : " << B << endl << endl;
}
void INTERCHANGE(float A, float B) {
    cout << "\n\nSWAPPING FLOAT VALUES\n\n";
    float tmp;
    tmp = A;
    A = B;
    B = tmp;
    cout << endl << "After Swapping :\n"
    "A : " << A << "\nB : " << B << endl << endl;
}
void INTERCHANGE(char A, char B) {
    cout << "\n\nSWAPPING CHARACTERS\n\n";
    char tmp;
    tmp = A;
    A = B;
    B = tmp;
    cout << endl << "After Swapping :\n"
    "A : " << A << "\nB : " << B << endl << endl;
}
main() {
    int INT_A, INT_B;
    float FLOAT_A, FLOAT_B;
    char CHAR_A, CHAR_B;
    cout << "Enter the value of INTEGER VARIABLES :\n" <<
        "A : ";
    cin >> INT_A;
    cout << "B : ";
    cin >> INT_B;
    INTERCHANGE(INT_A, INT_B);
    cout << "\nEnter the value of FLOAT VARIABLES :\n" <<
        "A : ";
    cin >> FLOAT_A;
    cout << "B : ";
    cin >> FLOAT_B;
    INTERCHANGE(FLOAT_A, FLOAT_B);
    cout << "\nEnter the value of CHARACTER VARIABLES :\n" <<
        "A : ";
    cin >> CHAR_A;
    cout << "B : ";
    cin >> CHAR_B;
    INTERCHANGE(CHAR_A, CHAR_B);

}