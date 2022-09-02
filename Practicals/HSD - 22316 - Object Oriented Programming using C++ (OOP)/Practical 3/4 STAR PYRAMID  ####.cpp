////////////////////////////////////////////
//  O.O.P. PRACTICAL 3 -[ Question 3 ]    //
//         ----STAR PYRAMID----           // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>
using namespace std;
main()
{
	int LOOP=1,LOOP_2,LOOP_3,LOOP_4,SIZE;
	cout<<"Enter the Number of Rows :";
	cin>>SIZE;
	while(LOOP<=SIZE)
	{
		for(LOOP_2=1;LOOP_2<LOOP_4;LOOP_2++)
		{
			cout<<"\t";
		}
		for(LOOP_3=1;LOOP_3<LOOP_2;LOOP_3++)
		{
			cout<<"*";
		}
	LOOP_4--;
    LOOP++;
    cout<<endl;
    }
}
