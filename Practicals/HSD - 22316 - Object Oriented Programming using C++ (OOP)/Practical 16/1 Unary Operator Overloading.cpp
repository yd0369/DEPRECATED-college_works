////////////////////////////////////////////
//  O.O.P. PRACTICAL 16 -[ Question 1 ]   //
//    -- Unary Operator Overloading --    // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>

using namespace std;
class SAINTS {
    private:
        int NUM_1, NUM_2;

    public:
        void get() {
            cout << "Enter the value of Number 1 : ";
            cin >> NUM_1;
            cout << "Enter the value of Number 2 : ";
            cin >> NUM_2;
        }
    SAINTS operator++() {
        NUM_1++;
        NUM_2++;
    }
    SAINTS operator--() {
        NUM_1--;
        NUM_2--;
    }
    int retrieve_NUM_1() {
        return NUM_1;
    }
    int retrieve_NUM_2() {
        return NUM_2;
    }
};
main() {
    SAINTS POP;
    POP.get();
    cout << "_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_" << endl;
    cout << endl << "Before Increment and Decrement : " << endl;
    cout << "Number 1 : " << POP.retrieve_NUM_1() << endl;
    cout << "Number 2 : " << POP.retrieve_NUM_2() << endl << endl;
    ++POP;
    cout << endl << "After Increment : " << endl;
    cout << "Number 1 : " << POP.retrieve_NUM_1() << endl;
    cout << "Number 2 : " << POP.retrieve_NUM_2() << endl << endl;
    --POP; // Reseting Values
    --POP;
    cout << endl << "After Decrement : " << endl;
    cout << "Number 1 : " << POP.retrieve_NUM_1() << endl;
    cout << "Number 2 : " << POP.retrieve_NUM_2() << endl << endl;

}