////////////////////////////////////////////
//  O.O.P. PRACTICAL 10 -[ Question 2 ]   //
// ---Constructor Function Overloading----// 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>
using namespace std;
class Product
{
	private:
		int prod_id;
		char prod_name[30];
		double prod_price;
		void get_data()
		{
			int i;
			if(i==0||i>=4) { i=1; }
			cout<<"Getting Information of Product #"<<i<<" : "<<endl;
			cout<<"Enter the Product ID : ";
		 	cin>>prod_id;
			cout<<"Enter the Product Name : ";
			cin>>prod_name;
			cout<<"Enter the Product Price : ";
			cin>>prod_price;
			cout<<endl;
			i++;
		}
		void put_data()
		{
			int i;
			if(i==0){i=3;}
			cout<<"Product #"<<i<<" : "<<endl<<endl;
			cout<<endl<<"Product ID : "<<prod_id<<endl;
			cout<<"Product Name : "<<prod_name<<endl;
			cout<<"Product Price : "<<prod_price<<endl<<endl;
			i--;
		}
	
	public:	
		Product()       { get_data(); }
		Product(int a)  { get_data(); }
		Product(char a)	{ get_data(); }
		~Product()      { put_data(); }
};
main()
{
	Product A;
	Product B(1);
	Product C('y');
	cout<<"----------------------------------"<<endl;
	cout<<"Retrieveing Information of :"<<endl<<endl;
}
