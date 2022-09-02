#include<iostream>

using namespace std;
int val = 0;
class test {
    public:
        test() {
            cout << ++val;
        }~test() {
            cout << val--;
        }
};
main() {
    test A, B, C; {
        test D;
    }
}