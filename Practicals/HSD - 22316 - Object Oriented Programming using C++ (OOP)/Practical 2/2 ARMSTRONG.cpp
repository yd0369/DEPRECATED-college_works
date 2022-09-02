////////////////////////////////////////////
//  O.O.P. PRACTICAL 2 -[ Question 2 ]    //
//       ----ARMSTRONG NUMBER----         // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>
#include<math.h>
using namespace std;
main()
{
	int NUM_1,NUM_2,NUM_COPY,TEMP_1,TEMP_2,DIGITS,REMAINS,SUM;
	int ARMS_ARRAY[50],ELEMENT=(-1);
	cout<<"Enter the First Number : ";
	cin>>NUM_1;
	cout<<"Enter the Second Number : ";
	cin>>NUM_2;
	if(NUM_1>NUM_2)
	{
		int SWAP;
		SWAP=NUM_1;
		NUM_1=NUM_2;
		NUM_2=SWAP;
	}
	cout<<endl<<endl;
	cout<<"ARMSTONG NUMBERS BETWEEN "<<NUM_1<<" AND "<<NUM_2<<" :"<<endl;
	NUM_COPY=NUM_1;
	for(NUM_COPY;NUM_COPY<=NUM_2;NUM_COPY++)
	{
		TEMP_1=NUM_COPY;
		TEMP_2=NUM_COPY;
		DIGITS=0,REMAINS=0,SUM=0;
		while(TEMP_1>0)
		{                          
			TEMP_1=TEMP_1/10;    
			DIGITS++;
		}
		while(TEMP_2>0)
		{
			REMAINS=TEMP_2%10;
			SUM=SUM+(pow(REMAINS,DIGITS));
			TEMP_2=TEMP_2/10;
		}
		if(SUM==NUM_COPY)
		{
			ELEMENT++;
			cout<<SUM<<endl;
		}
	}
	if(ELEMENT==(-1))
	{
		cout<<"NO ARMSTRONG NUMBER FOUND !!";
	}
}

