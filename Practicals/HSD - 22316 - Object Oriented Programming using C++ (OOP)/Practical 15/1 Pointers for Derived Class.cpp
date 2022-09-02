////////////////////////////////////////////
//  O.O.P. PRACTICAL 15 -[ Question 1 ]   //
//     -- Pointer for Derived Class--     // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>

using namespace std;
class Polygon {
    private:
        double Height, Width;

    public:
        void get() {
            cout << "Enter the Height of the Polygon : ";
            cin >> Height;
            cout << "Enter the Width of the Polygon : ";
            cin >> Width;
        }
    double get_height() {
        return Height;
    }
    double get_width() {
        return Width;
    }
};
class Rectangle: public Polygon {
    public: void area() {
        get();
        cout << endl << "Area of Rectangle : ";
        cout << ((get_height()) * (get_width())) << endl << endl;
        cout << "----------------------------------" << endl;
    }
};
class Triangle: public Polygon {
    public: void area() {
        get();
        cout << endl << "Area of Triangle : ";
        cout << (((get_height()) * (get_width())) / 2) << endl;
    }
};
main() {
    Rectangle RR, * R;
    Triangle TT, * T;
    R = & RR;
    T = & TT;
    R -> area();
    T -> area();
}