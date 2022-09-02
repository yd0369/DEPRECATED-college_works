////////////////////////////////////////////
//  O.O.P. PRACTICAL 4 -[ Question 3 ]    //
// ----Smallest and Second Smallest----   //
//        ----Elements Finder----         // 
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>
using namespace std;
main()
{
	int ARRAY[100],SIZE,LOOP,SMALL,SMALLJR;
	cout<<"Enter the Size of Array [0-99] : ";
	cin>>SIZE;
	cout<<endl<<endl<<endl;
	cout<<"Enter the elements of Array:"<<endl;
	for(LOOP=0;LOOP<SIZE;LOOP++)	
	{
		cin>>ARRAY[LOOP];
	}
	SMALL=SMALLJR=9999;
	for(LOOP=0;LOOP<SIZE;LOOP++)
	{
		if(ARRAY[LOOP]<SMALL)
		{
			SMALL=ARRAY[LOOP];
		}
	}
	for(LOOP=0;LOOP<SIZE;LOOP++)
	{
		if(ARRAY[LOOP]<SMALLJR && ARRAY[LOOP]!=SMALL)
		{
			SMALLJR=ARRAY[LOOP];
		}
	}
	cout<<endl<<endl<<endl;
	cout<<"SMALLEST NUMBER : "<<SMALL<<endl;
	cout<<"SECOND SMALLEST NUMBER : "<<SMALLJR;
}
