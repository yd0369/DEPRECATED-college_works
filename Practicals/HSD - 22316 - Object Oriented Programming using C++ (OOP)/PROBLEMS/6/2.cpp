#include<iostream>

using namespace std;
class Rectangle {
    int width, height;
    public:
        void set_values(int, int);
    int area() {
        return width * height;
    }
};
void Rectangle::set_values(int x, int y) {
    width = x;
    height = y;
}
int main() {
    rectangle rect;
    rect.set values(3, 4);
    cout << "area:" <<
        rect.area();
}