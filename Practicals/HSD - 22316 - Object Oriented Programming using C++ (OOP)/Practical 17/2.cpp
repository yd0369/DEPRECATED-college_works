////////////////////////////////////////////
//  O.O.P. PRACTICAL 17 -[ Question 2 ]   //
//         --  Class Binary  --           //
//      -- Operator Overloading --        // 
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>

using namespace std;
class Binary {
    public:
        float NUM_IN;
    void get_num() {
        cin >> NUM_IN;
    }
    void put_banner() {
        cout << endl << "\tSum \tDifference \tProduct \tQuotient" << endl;
    }

};
Binary operator + (Binary & NUM_1, Binary & NUM_2) {
    Binary TMP;
    TMP.NUM_IN = (NUM_1.NUM_IN) + (NUM_2.NUM_IN);
    return (TMP);
}
Binary operator - (Binary & NUM_1, Binary & NUM_2) {
    Binary TMP;
    TMP.NUM_IN = (NUM_1.NUM_IN) - (NUM_2.NUM_IN);
    return (TMP);
}
Binary operator * (Binary & NUM_1, Binary & NUM_2) {
    Binary TMP;
    TMP.NUM_IN = (NUM_1.NUM_IN) * (NUM_2.NUM_IN);
    return (TMP);
}
Binary operator / (Binary & NUM_1, Binary & NUM_2) {
    Binary TMP;
    TMP.NUM_IN = (NUM_1.NUM_IN) / (NUM_2.NUM_IN);
    return (TMP);
}
main() {
    Binary A, B, Sum, Difference, Product, Quotient;
    cout << "Enter the value of 2 NUMBERS : ";
    A.get_num();
    B.get_num();
    cout << "\n\n__________________________"
    "________________________________\n\n";
    cout << "\tNUMBER 1 \tNUMBER 2" << endl <<
        "\t" << A.NUM_IN << "\t\t" <<
        B.NUM_IN;
    cout << "\n\n__________________________"
    "________________________________\n\n";
    A.put_banner();
    Sum = A + B;
    Difference = A - B;
    Product = A * B;
    Quotient = A / B;
    cout << "\t" << Sum.NUM_IN;
    cout << "\t     " << Difference.NUM_IN;
    cout << "\t" << Product.NUM_IN;
    cout << "\t\t" << Quotient.NUM_IN;
}