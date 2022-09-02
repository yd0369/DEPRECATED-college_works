////////////////////////////////////////////
//  O.O.P. PRACTICAL 10 -[ Question 1 ]   //
//-- Constructor And Destructor Function--// 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>

using namespace std;
class Number {
    private:
        double X, Y;

    public:
        Number() {
            get_data();
            cout << "ADDITION : " << ADDITION() << endl;
            cout << "SUBTRACTION : " << SUBTRACTION() << endl;
            cout << "MULTIPLICATION : " << MULTIPLICATION() << endl;
            cout << "DIVISION : " << DIVISION() << endl;
        }

        ~Number() {
            cout << endl << "Destructor Intialized...." << endl;
        }

    void get_data() {
        cout << "Enter the value of First Number : ";
        cin >> X;
        cout << "Enter the value of Second Number : ";
        cin >> Y;
    }
    double ADDITION() {
        return (X + Y);
    }
    double SUBTRACTION() {
        return (X - Y);
    }
    double MULTIPLICATION() {
        return (X * Y);
    }
    double DIVISION() {
        return (X / Y);
    }

}
N;
main() {}