/////////////////////////////////////////////
//  O.O.P. PRACTICAL 13 -[ Question 2 ]    //
// 		  --Hybrid Inhertitance--          // 
//Class cricketer,bowler,batsman,allrounder//
//              YASH DESAI                 //
/////////////////////////////////////////////
#include<iostream>

using namespace std;
class cricketer {
    public:
        char name[20];
    void get_data() {
        cout << endl << "Enter the Cricketer Name : ";
        cin >> name;
    }
};

class batsman: public cricketer {
    private: char Batsman;
    void get_data() {
        cout << "Are you Batsman? ['Y'-Yes OR 'N'-No] : ";
        cin >> Batsman;
    }

    public: batsman() {
        get_data();
    }~batsman() {
        cricketer::get_data();
    }
    char get() {
        return Batsman;
    }

};
class bowler: public cricketer {
    private: char Bowler;
    void get_data() {
        cout << "Are you Bowler? ['Y'-Yes OR 'N'-No] : ";
        cin >> Bowler;
    }

    public: bowler() {
        get_data();
    }
    char get() {
        return Bowler;
    }~bowler() {
        cout << endl << "THNX FOR SHARING YOUR INFO WITH US....";
    }
};
class allrounder: public bowler, public batsman {
    private: void all_rounder_finder() {
        if ((bowler::get()) == 'Y' || (bowler::get()) == 'y') {
            if ((batsman::get()) == 'Y' || (batsman::get()) == 'y') {
                cout << endl << "You are an All Rounder";
            } else {
                cout << endl << "You are NOT an All Rounder";
            }
        } else {
            cout << endl << "You are NOT an All Rounder";
        }
        cout << endl;
    }

    public: allrounder() {
        all_rounder_finder();
    }

};
main() {
    cout << "We want All Rounder Please Fill Following Information:" << endl;
    allrounder MARK_1;
}