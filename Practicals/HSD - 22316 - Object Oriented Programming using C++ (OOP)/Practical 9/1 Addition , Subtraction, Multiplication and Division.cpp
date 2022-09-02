////////////////////////////////////////////
//  O.O.P. PRACTICAL 9 -[ Question 1 ]    //
//        ----Inline Function----         // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>

using namespace std;
class Number {
    private:
        double X, Y;

    public:
        void get_data() {
            cout << "Enter the value of First Number : ";
            cin >> X;
            cout << "Enter the value of Second Number : ";
            cin >> Y;
        }

    inline void Arithmetic_Operations() {
        cout << endl;
        cout << "ADDITION : " << (X + Y) << endl;
        cout << "SUBTRACTION : " << (X - Y) << endl;
        cout << "MULTIPLICATION : " << (X * Y) << endl;
        cout << "DIVISION : " << (X / Y) << endl;
    }

}
N;

main() {
    N.get_data();
    N.Arithmetic_Operations();
}