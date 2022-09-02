////////////////////////////////////////////
//  O.O.P. PRACTICAL 4 -[ Question 2 ]    //
//      ----CITY CLASS QUESTION----       // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>

using namespace std;
class City {
    private:
        char name[30];
    int population;

    public:
        void get_data();
    void display_data();
}
B[10];

void City::get_data() {
    cout << "Enter City Name : ";
    cin >> name;
    cout << "Enter Population : ";
    cin >> population;
}

void City::display_data() {
    cout << "City : " << name << endl;
    cout << "Population : " << population << endl;
}

main() {
    int Loop, Times;
    cout << "Enter the Number of City/Cities info you want to Save [1-10]: ";
    cin >> Times;
    for (Loop = 1; Loop <= Times; Loop++) {
        cout << endl << endl;
        cout << "Enter the Information of City Number " << Loop;
        cout << endl;
        B[Loop].get_data();
    }
    cout << endl << endl << endl;
    cout << "Displaying All Information Saved";
    cout << endl << endl << endl;
    for (Loop = 1; Loop <= Times; Loop++) {
        B[Loop].display_data();
        cout << endl << endl;
    }

}