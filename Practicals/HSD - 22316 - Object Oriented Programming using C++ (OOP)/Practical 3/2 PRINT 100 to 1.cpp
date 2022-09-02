////////////////////////////////////////////
//  O.O.P. PRACTICAL 3 -[ Question 2 ]    //
//    ----BETWEEN NUMBER's PRINTER----    // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>
using namespace std;
main()
{
	int NUMBER_1,NUMBER_2,ORDER;
	cout<<"Enter the NUMBER FROM : ";
	cin>>NUMBER_1;
	cout<<"Enter the NUMBER UPTO : ";
	cin>>NUMBER_2;
	if(NUMBER_1>NUMBER_2)
	{
		int TEMP;
		TEMP=NUMBER_1;
		NUMBER_1=NUMBER_2;
		NUMBER_2=TEMP;
	}
	system("cls");
	cout<<"How to Print Numbers ?"<<endl;
	cout<<"1. Ascending order"<<endl<<"2. Descending order"<<endl;
	cout<<">>>>[1 or 2 only] : ";
	cin>>ORDER;
	cout<<endl<<endl<<endl;
	cout<<"The Number Between "<<NUMBER_1<<" ~ "<<NUMBER_2<<" are";
	cout<<endl;
	if(ORDER==1)
	{
		for(NUMBER_1;NUMBER_1<=NUMBER_2;NUMBER_1++)
		{
			cout<<NUMBER_1<<endl;
		}
	}
	else if(ORDER==2)
	{
		for(NUMBER_2;NUMBER_2>=NUMBER_1;NUMBER_2--)
		{
			cout<<NUMBER_2<<endl;
		}
	}
	else
	{
		cout<<"INVALID INPUT"<<endl;
		cout<<"PLEASE PRESS ANY KEY TO EXIT THE PROGRAM";
	}
}
