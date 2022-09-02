////////////////////////////////////////////
//  O.O.P. PRACTICAL 4 -[ Question 2 ]    //
//      ----CLASS BOOK QUESTION----       // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>

using namespace std;
class Book {
    private:
        char book_name[30];
    char author[30];

    public:
        int price;
    void get_data();
    void display_max_priced_data();
}
B[10];

void Book::get_data() {
    cout << "Enter Book Name : ";
    cin >> book_name;
    cout << "Enter Book " << book_name << " Author's name : ";
    cin >> author;
    cout << "Enter Book " << author << "'s " << book_name << " Price : ";
    cin >> price;
}

void Book::display_max_priced_data() {
    cout << author << "'s  " << book_name << " with Price of " << price;
}
main() {
    int Loop, Times, Max, Position;
    cout << "Enter the Number of Books info you want to Save [1-10]: ";
    cin >> Times;
    for (Loop = 1; Loop <= Times; Loop++) {
        cout << endl << endl;
        cout << "Enter the Information of Book Number " << Loop;
        cout << endl;
        B[Loop].get_data();
    }
    for (Loop = 1; Loop <= Times; Loop++) {
        if (B[Loop].price > Max) {
            Max = B[Loop].price;
            Position = Loop;
        }
    }
    cout << endl << endl << endl;
    cout << "The maximum price book from all " << Times << " Books is :" << endl;
    B[Position].display_max_priced_data();

}