////////////////////////////////////////////
//  O.O.P. PRACTICAL 14 -[ Question 2 ]   //
//  -- Classes ,Objects and Pointer --    // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>

using namespace std;
class Box {
    private:
        double length, width, breadth;

    public:
        void get() {
            cout << "Enter the Box Length : ";
            cin >> length;
            cout << "Enter the Box Width : ";
            cin >> width;
            cout << "Enter the Box Breadth : ";
            cin >> breadth;
        }
    double calculate_area() {
        return (2 * ((length * width) + (length * breadth) + (breadth * width)));
    }
    double calculate_volume() {
        return (length * width * breadth);
    }
    void put() {
        cout << "Box Total Area : " << calculate_area();
        cout << endl << "Box Total Volume : " << calculate_volume();
    }
};
main() {
    Box B1, * B2;
    B2 = & B1;
    B2 -> get();
    B2 -> put();
}