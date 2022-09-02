////////////////////////////////////////////
//  O.O.P. PRACTICAL 14 -[ Question 1 ]   //
//  -- Classes ,Objects and Pointer --    // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>

using namespace std;
class Book {
    private:
        char book_name[10], auther_name[10];
    double price;

    public:
        void get() {
            cout << "Enter the Book Name : ";
            cin >> book_name;
            cout << "Enter the auther_name : ";
            cin >> auther_name;
            cout << "Enter the Book Price : ";
            cin >> price;
        }
};
main() {
    Book B1, * B2;
    B2 = & B1;
    B2 -> get();
}