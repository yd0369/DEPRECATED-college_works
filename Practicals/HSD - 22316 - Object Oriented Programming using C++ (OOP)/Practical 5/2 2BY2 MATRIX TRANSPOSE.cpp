////////////////////////////////////////////
//  O.O.P. PRACTICAL 4 -[ Question 2 ]    //
//    ----2 by 2 Matrix Transposer----    // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>

using namespace std;
main() {
    int MATRIX[2][2], MATRIX_TRANSPOSE[2][2];
    int LOOP_1, LOOP_2;
    cout << "Enter the Values of First Matrix :" << endl;
    for (LOOP_1 = 0; LOOP_1 < 2; LOOP_1++) {
        for (LOOP_2 = 0; LOOP_2 < 2; LOOP_2++) {
            cin >> MATRIX[LOOP_1][LOOP_2];
        }
    }
    cout << endl << endl << endl;
    cout << "Matrix :" << endl << endl;
    for (LOOP_1 = 0; LOOP_1 < 2; LOOP_1++) {
        for (LOOP_2 = 0; LOOP_2 < 2; LOOP_2++) {
            cout << MATRIX[LOOP_1][LOOP_2];
            cout << "\t";
        }
        cout << endl;
    }
    for (LOOP_1 = 0; LOOP_1 < 2; LOOP_1++) {
        for (LOOP_2 = 0; LOOP_2 < 2; LOOP_2++) {
            MATRIX_TRANSPOSE[LOOP_1][LOOP_2] = MATRIX[LOOP_2][LOOP_1];
        }
    }
    cout << endl;
    cout << "Transpose of Matrix :" << endl << endl;
    for (LOOP_1 = 0; LOOP_1 < 2; LOOP_1++) {
        for (LOOP_2 = 0; LOOP_2 < 2; LOOP_2++) {
            cout << MATRIX_TRANSPOSE[LOOP_1][LOOP_2];
            cout << "\t";
        }
        cout << endl;
    }

}