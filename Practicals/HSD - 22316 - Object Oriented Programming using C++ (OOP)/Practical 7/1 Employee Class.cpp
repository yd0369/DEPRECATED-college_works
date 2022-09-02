////////////////////////////////////////////
//  O.O.P. PRACTICAL 4 -[ Question 2 ]    //
//    ----EMPLOYEE CLASS QUESTION----     // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>

using namespace std;
class Employee {
    private:
        char emp_id[30];
    char emp_name[30];

    public:
        float salary;
    void get_data();
    void display_max_salary_data();
}
B[10];

void Employee::get_data() {
    cout << "Enter Employee ID : ";
    cin >> emp_id;
    cout << "Enter Employee Name : ";
    cin >> emp_name;
    cout << "Enter Employee Salary : ";
    cin >> salary;
}

void Employee::display_max_salary_data() {
    cout << "Employee ID : " << emp_id << endl;
    cout << "Employee Name : " << emp_name << endl;
    cout << "Employee Salary : " << salary;
}
main() {
    int Loop, Times, Max, Position;
    cout << "Enter the Number of Employee info you want to Save [1-10]: ";
    cin >> Times;
    for (Loop = 1; Loop <= Times; Loop++) {
        cout << endl << endl;
        cout << "Enter the Information of Employee Number " << Loop;
        cout << endl;
        B[Loop].get_data();
    }
    for (Loop = 1; Loop <= Times; Loop++) {
        if (B[Loop].salary > Max) {
            Max = B[Loop].salary;
            Position = Loop;
        }
    }
    cout << endl << endl << endl;
    cout << "The employee having maximum salary from all " << Times << " Employees is :" << endl;
    B[Position].display_max_salary_data();

}