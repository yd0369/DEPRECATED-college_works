////////////////////////////////////////////
//  O.O.P. PRACTICAL 12 -[ Question 2 ]   //
// 		--Multilevel Inhertitance--       // 
//     --Class car,brand and model--      //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>

using namespace std;
class car {
    private:
        char car_type[20];

    public:
        void get_data() {
            cout << "Enter the Car Type : ";
            cin >> car_type;
        }
    void put_data() {
        cout << endl << "Car Type : " << car_type;
    }
};
class brand: public car {
    private: double speed;
    char brand_name[30];

    public: void get_data2() {
        cout << "Enter the Car Top Speed : ";
        cin >> speed;
        cout << "Enter the Car Brand Name : ";
        cin >> brand_name;
    }
    void put_data2() {
        cout << endl << "Car Top Speed : " << speed;
        cout << endl << "Car Brand Name : " << brand_name;
    }
};
class model: public brand {
    private: double price;
    char model_name[30];

    void get_data3() {
        cout << "Enter the Car Price : ";
        cin >> price;
        cout << "Enter the Car Model Name : ";
        cin >> model_name;
    }
    void put_data3() {
        cout << endl << "Car Price : " << price;
        cout << endl << "Car Model Name : " << model_name;
    }

    public: model() {
        cout << "Getting Data :" << endl;
        get_data();
        get_data2();
        get_data3();
        cout << endl << ":::::::::::::::" << endl;
        cout << "Putting Data :" << endl;
        put_data();
        put_data2();
        put_data3();
    }
};
main() {
    model MARK_1;
}