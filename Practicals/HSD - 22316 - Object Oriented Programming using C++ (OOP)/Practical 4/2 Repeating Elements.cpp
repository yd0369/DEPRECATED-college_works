////////////////////////////////////////////
//  O.O.P. PRACTICAL 4 -[ Question 2 ]    //
//   ----Repeating Elements Finder----    // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>
using namespace std;
main()
{
	int ARRAY[100],SIZE,LOOP_1,LOOP_2,TEMP,TIMES;
	cout<<"Enter the Size of Array [0-99] : ";
	cin>>SIZE;
	cout<<endl<<endl<<endl;
	cout<<"Enter the elements of Array:"<<endl;
	for(LOOP_1=0;LOOP_1<SIZE;LOOP_1++)	
	{
		cin>>ARRAY[LOOP_1];
	}
	for(LOOP_1=0;LOOP_1<SIZE;LOOP_1++)
	{
		TEMP=ARRAY[LOOP_1];
		TIMES=0;
		for(LOOP_2=0;LOOP_2<SIZE;LOOP_2++)
		{
			if(TEMP==ARRAY[LOOP_2])
			{
				TIMES++;
			}
		}
		if(TIMES!=0 && TIMES!=1)
		{
			cout<<"The "<<LOOP_1<<" element with value "<<ARRAY[LOOP_1];
			cout<<" is repeated "<<TIMES<<endl; 
		}
	}
}
