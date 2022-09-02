#include<iostream>

using namespace std;
class InlineDemo {
    public:
        inline int square(int is);
};

//use inline prefix
inline int InlineDemo::square(int s) {
    return s * s;
}
main() {

    InlineDemo s;
    cout << "Square of a No is:" << s.square(10);
}