////////////////////////////////////////////
//  O.O.P. PRACTICAL 4 -[ Question 4 ]    //
//    ----Missing Elements Finder----     //
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>
using namespace std;
main()
{
	int ARRAY[100],SIZE,LOOP,SEARCH,POSITION;
	cout<<"Enter the Size of Array [0-99] : ";
	cin>>SIZE;
	cout<<endl<<endl<<endl;
	cout<<"Enter the elements of Array:"<<endl;
	for(LOOP=0;LOOP<SIZE;LOOP++)	
	{
		cin>>ARRAY[LOOP];
	}
	cout<<"Enter the value to search : ";
	cin>>SEARCH;
	for(LOOP=0;LOOP<=SIZE;LOOP++)	
	{
		if(SEARCH==ARRAY[LOOP])
		{
			POSITION=LOOP;
			break;
		}
		else
		{
			POSITION=-999;
		}
	}
	if(POSITION!=-999)
	{
		cout<<"The Missing Number you were searching for is at :"<<endl;
		cout<<"Index Position : "<<POSITION<<endl;
		cout<<"Memory Address : "<<&ARRAY[POSITION]<<endl;
		cout<<"Element Value : "<<ARRAY[POSITION];
	}
	else
	{
		cout<<"ELEMENT NOT FOUND IN THE ARRAY !";
	}
}
