#include<iostream>

using namespace std;
class A {
    public:
        void print() {
            cout << "print() in A";
        }
};
class B: private A {
    public: void print() {
        cout << "print() in B";
    }
};
class C: public B {
    public: void print() {
        cout << "print() in C";
        A::print();
    }
};
main() {
    C b;
    b.print();
}