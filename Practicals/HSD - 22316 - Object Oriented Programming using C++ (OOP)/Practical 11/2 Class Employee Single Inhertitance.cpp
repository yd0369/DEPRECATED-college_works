////////////////////////////////////////////
//  O.O.P. PRACTICAL 11 -[ Question 2 ]   //
// --Class Employee Single Inhertitance-- // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>

using namespace std;
class Employee {
    private:
        int emp_no;
    char emp_name[20], emp_designation[20];

    public:
        void get_data() {
            cout << "Enter the Employee Number : ";
            cin >> emp_no;
            cout << "Enter the Employee Name : ";
            cin >> emp_name;
            cout << "Enter the Employee Designation : ";
            cin >> emp_designation;
        }
    void put_data() {
        cout << endl << "Employee Number : " << emp_no;
        cout << endl << "Employee Name : " << emp_name;
        cout << endl << "Employee Designation : " << emp_designation;
        cout << endl;
    }
};
class Salary: public Employee {
    private: double basic,
    hra,
    da,
    gross_sal;
    void get_data2() {
        cout << "Enter the Basic Salary : ";
        cin >> basic;
        hra = (30 / 100) * basic;
        da = (74.5 / 100) * basic;
        gross_sal = basic + hra + da;
    }
    void put_data2() {
        cout << endl << "Basic Salary : " << basic;
        cout << endl << "H.R.A. : " << hra;
        cout << endl << "D.A. : " << da;
        cout << endl << "Gross Salary : " << basic + hra + da;
    }

    public: Salary() {
        cout << "Getting Data :" << endl;
        get_data();
        get_data2();
        cout << ":::::::::::::::" << endl;
        cout << "Putting Data :" << endl;
        put_data();
        put_data2();
    }
};
main() {
    Salary Dollars;
}