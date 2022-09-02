////////////////////////////////////////////
//  O.O.P. PRACTICAL 4 -[ Question 1 ]    //
//  ----MEDIANS OF TWO SORTED ARRAYS----  // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>

using namespace std;
main() {
    int ARRAY_1[100], ARRAY_2[100], ARRAY_MERGE[200], SIZE, LOOP, MLOOP, TEMP;
    cout << "NOTE :- BOTH ARRAYS WILL BE OF SAME SIZE" << endl;
    cout << "Enter the Size of Array [0-99] : ";
    cin >> SIZE;
    cout << endl << endl << endl;
    cout << "Note :- All elements of both arrays must be in sorted";
    cout << " manner [IN ASCENDING ORDER]." << endl;
    cout << "Enter the elements of First Array:" << endl;
    for (LOOP = 0; LOOP < SIZE; LOOP++) {
        cin >> ARRAY_1[LOOP];
    }
    cout << endl << endl << endl;
    cout << "Enter the elements of Second Array:" << endl;
    for (LOOP = 0; LOOP < SIZE; LOOP++) {
        cin >> ARRAY_2[LOOP];
    }
    cout << endl << endl << endl;
    LOOP = 0;
    for (MLOOP = 0; MLOOP < (SIZE * 2); MLOOP++) {
        ARRAY_MERGE[MLOOP] = ARRAY_1[LOOP];
        MLOOP++;
        ARRAY_MERGE[MLOOP] = ARRAY_2[LOOP];
        LOOP++;
    }
    cout << endl << endl << endl;
    for (LOOP = 0; LOOP < SIZE; LOOP++) {
        cout << ARRAY_MERGE[LOOP] << endl;
    }
    for (LOOP = 0; LOOP < SIZE; LOOP++) {
        for (MLOOP = 0; MLOOP < (SIZE - LOOP - 1); MLOOP++) {
            if (ARRAY_MERGE[MLOOP] > ARRAY_MERGE[MLOOP + 1]) {
                TEMP = ARRAY_MERGE[MLOOP];
                ARRAY_MERGE[MLOOP] = ARRAY_MERGE[MLOOP + 1];
                ARRAY_MERGE[MLOOP + 1] = TEMP;
            }
        }
    }
    cout << endl << endl << endl;
    for (LOOP = 0; LOOP < SIZE; LOOP++) {
        cout << ARRAY_MERGE[LOOP] << endl;
    }

}