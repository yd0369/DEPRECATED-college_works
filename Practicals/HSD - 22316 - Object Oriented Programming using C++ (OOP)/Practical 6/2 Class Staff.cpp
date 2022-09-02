////////////////////////////////////////////
//  O.O.P. PRACTICAL 4 -[ Question 2 ]    //
//      ----STAFF BOOK QUESTION----       // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>

using namespace std;
class Staff {
    private:
        char member_name[30];
    float Basic, DA, HRA, Gross;

    public:
        void get_data();
    void display_data();
}
B[10];

void Staff::get_data() {
    cout << "Enter Member Name : ";
    cin >> member_name;
    cout << "Enter Basic Salary : ";
    cin >> Basic;
}

void Staff::display_data() {
    DA = 0.745 * Basic;
    HRA = 0.3 * Basic;
    Gross = Basic + DA + HRA;
    cout << "Member Name : " << member_name << endl;
    cout << "Basic Salary : " << Basic << endl;
    cout << "DA : " << DA << endl;
    cout << "HRA : " << HRA << endl;
    cout << "Gross Salary : " << Gross;
}

main() {
    int Loop, Times;
    cout << "Enter the Number of Staff Memeber info you want to Save [1-10]: ";
    cin >> Times;
    for (Loop = 1; Loop <= Times; Loop++) {
        cout << endl << endl;
        cout << "Enter the Information of Staff Member Number " << Loop;
        cout << endl;
        B[Loop].get_data();
    }
    cout << endl << endl;
    Loop = 0;
    cout << "Enter the Staff Member Number you want [1-" << Times << "] : ";
    cin >> Loop;
    cout << endl << endl << endl;
    B[Loop].display_data();

}