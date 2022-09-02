////////////////////////////////////////////
//  O.O.P. PRACTICAL 4 -[ Question 1 ]    //
//    ----3 by 3 Matrix Multiplier----    // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>

using namespace std;
main() {
    int MATRIX_1[3][3][1], MATRIX_2[3][3][1], MATRIX_PRODUCT[3][3][1];
    int LOOP_1, LOOP_2, LOOP_3, LOGIC_LOOP, TEMP;
    cout << "Enter the Values of First Matrix :" << endl;
    for (LOOP_1 = 0; LOOP_1 < 3; LOOP_1++) {
        for (LOOP_2 = 0; LOOP_2 < 3; LOOP_2++) {
            for (LOOP_3 = 0; LOOP_3 < 1; LOOP_3++) {
                cin >> MATRIX_1[LOOP_1][LOOP_2][LOOP_3];
            }
        }
    }
    cout << "Enter the Values of Second Matrix :" << endl;
    for (LOOP_1 = 0; LOOP_1 < 3; LOOP_1++) {
        for (LOOP_2 = 0; LOOP_2 < 3; LOOP_2++) {
            for (LOOP_3 = 0; LOOP_3 < 1; LOOP_3++) {
                cin >> MATRIX_2[LOOP_1][LOOP_2][LOOP_3];
            }
        }
    }
    cout << endl << endl << endl;
    cout << "Product of two Matrix :" << endl;
    cout << "Matrix A :" << endl << endl;
    for (LOOP_1 = 0; LOOP_1 < 3; LOOP_1++) {
        for (LOOP_2 = 0; LOOP_2 < 3; LOOP_2++) {
            for (LOOP_3 = 0; LOOP_3 < 1; LOOP_3++) {
                cout << MATRIX_1[LOOP_1][LOOP_2][LOOP_3];
            }
            cout << "\t";
        }
        cout << endl;
    }
    cout << endl;
    cout << "Matrix B :" << endl << endl;
    for (LOOP_1 = 0; LOOP_1 < 3; LOOP_1++) {
        for (LOOP_2 = 0; LOOP_2 < 3; LOOP_2++) {
            for (LOOP_3 = 0; LOOP_3 < 1; LOOP_3++) {
                cout << MATRIX_2[LOOP_1][LOOP_2][LOOP_3];
            }
            cout << "\t";
        }
        cout << endl;
    }
    for (LOOP_1 = 0; LOOP_1 < 3; LOOP_1++) {
        for (LOOP_2 = 0; LOOP_2 < 3; LOOP_2++) {
            for (LOOP_3 = 0; LOOP_3 < 1; LOOP_3++) {
                MATRIX_PRODUCT[LOOP_1][LOOP_2][LOOP_3] = 0;
                for (LOGIC_LOOP = 1; LOGIC_LOOP < 3; LOGIC_LOOP++) {
                    MATRIX_PRODUCT[LOOP_1][LOOP_2][LOOP_3] += (MATRIX_1[LOOP_1][LOOP_2][LOOP_3] * MATRIX_2[LOOP_1][LOOP_2][LOOP_3]);
                }
            }
        }
    }
    cout << endl;
    cout << "Matrix Product :" << endl << endl;
    for (LOOP_1 = 0; LOOP_1 < 3; LOOP_1++) {
        for (LOOP_2 = 0; LOOP_2 < 3; LOOP_2++) {
            for (LOOP_3 = 0; LOOP_3 < 1; LOOP_3++) {
                cout << MATRIX_PRODUCT[LOOP_1][LOOP_2][LOOP_3];
            }
            cout << "\t";
        }
        cout << endl;
    }

}