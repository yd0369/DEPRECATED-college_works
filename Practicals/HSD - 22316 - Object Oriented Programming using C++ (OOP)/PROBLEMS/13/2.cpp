#include<iostream>

using namespace std;
struct a {
    int count;
};
struct b {
    int * value;
};
struct c: public a, public b {};
main() {
    c * p = new c;
    p -> value = 0;
    cout << "Inherited";
}