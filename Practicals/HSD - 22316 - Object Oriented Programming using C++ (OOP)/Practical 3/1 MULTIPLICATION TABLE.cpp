////////////////////////////////////////////
//  O.O.P. PRACTICAL 3 -[ Question 1 ]    //
//    ----MULTIPLICATION TABLE----        // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>

using namespace std;
main() {
    int NUMBER, LOOP;
    cout << "Enter the NUMBER : ";
    cin >> NUMBER;
    cout << endl << endl << endl;
    for (LOOP = 1; LOOP <= 10; LOOP++) {
        cout << NUMBER << "\t*\t" << LOOP << "\t=\t" << LOOP * NUMBER;
        cout << endl;
    }
}