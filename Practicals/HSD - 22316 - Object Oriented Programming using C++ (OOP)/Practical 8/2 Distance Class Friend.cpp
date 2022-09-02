////////////////////////////////////////////
//  O.O.P. PRACTICAL 4 -[ Question 2 ]    //
//      ----Distance Class with----       //
//        ----Friend Function----         // 
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>

using namespace std;
class Distance {
    private:
        int Meters;

    public:
        friend void SUM(Distance X, Distance Y) {
            cout << "SUM of Distances : " << X.Meters + Y.Meters;
        }
    void get_data() {
        cout << "Enter the value of Number : ";
        cin >> Meters;
    }
}
D1, D2;

main() {
    D1.get_data();
    D2.get_data();
    SUM(D1, D2);
}