////////////////////////////////////////////
//  O.O.P. PRACTICAL 4 -[ Question 2 ]    //
// ----Swapping with Friend Function----  // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>

using namespace std;
class Swapper {
    private:
        int NUM_1, NUM_2, TEMP;
    void get_data() {
        cout << "Enter the value of First Number : ";
        cin >> NUM_1;
        cout << "Enter the value of Second Number : ";
        cin >> NUM_2;
    }
    void display_data_before() {
        cout << "Before Swapping :" << endl;
        cout << "A : " << NUM_1 << endl;
        cout << "B : " << NUM_2 << endl;
    }
    void swap_logic() {
        TEMP = NUM_1;
        NUM_1 = NUM_2;
        NUM_2 = TEMP;
    }
    void display_data_after() {
        cout << "After Swapping :" << endl;
        cout << "A : " << NUM_1 << endl;
        cout << "B : " << NUM_2 << endl;
    }

    public:
        friend void swap_data(Swapper POP) {
            POP.get_data();
            POP.display_data_before();
            POP.swap_logic();
            POP.display_data_after();
        }
}
Y;

main() {
    swap_data(Y);
}