////////////////////////////////////////////
//  O.O.P. PRACTICAL 17 -[ Question 1 ]   //
//    --  Adding 2 Complex Numbers  --    //
//      -- Operator Overloading --        // 
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>

using namespace std;
class Complexity {
    private:
        double REAL, IMAGINARY;

    public:
        void get_complex(int X) {
            cout << "Enter the value of Real Part [" << X << "] : ";
            cin >> REAL;
            cout << "Enter the value of Imaginary Part [" << X << "] : ";
            cin >> IMAGINARY;
        }
    void put_complex() {
        cout << "Real Part : " << REAL << endl;
        cout << "Imaginary Part : " << IMAGINARY;
    }
    friend Complexity operator + (Complexity & C_1, Complexity & C_2) {
        Complexity C_SUM;
        (C_SUM.REAL) = (C_1.REAL) + (C_2.REAL);
        (C_SUM.IMAGINARY) = (C_1.IMAGINARY) + (C_2.IMAGINARY);
        return (C_SUM);
    }
};

main() {
    Complexity A, B, SUM;
    A.get_complex(1);
    cout << endl;
    B.get_complex(2);
    SUM = A + B;
    SUM.put_complex();
}