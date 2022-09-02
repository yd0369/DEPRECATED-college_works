#include<iostream>

using namespace std;
class student {

    private:
        int rollno;
    string name;
    public:
        student(): rollno(0), name("") {}
    student(int r, string n): rollno(r), name(n) {}
    void get() {
        cout << "enter roll no";
        cin >> rollno;
        cout << "enter name";
        cin >> name;
    }
    void print() {
        cout << "roll no is" << rollno;
        cout << "name is " << name;
    }
};
main() {
    student * ps = new student;
    ( * ps).get();
    ( * ps).print();
    delete ps;
}