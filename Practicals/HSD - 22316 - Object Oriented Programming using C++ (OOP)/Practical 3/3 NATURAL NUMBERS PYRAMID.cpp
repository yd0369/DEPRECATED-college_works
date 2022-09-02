////////////////////////////////////////////
//  O.O.P. PRACTICAL 3 -[ Question 3 ]    //
//       ----Floyd's Triangle----         // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>
using namespace std;
main()
{
	int NATURAL_NUM=1,LOOP=1,LOOP_2;
	while(LOOP<=5)
	{
  		for (LOOP_2=0;LOOP_2<LOOP;LOOP_2++)
    	{
		    cout<<"\t"<<NATURAL_NUM;
         	NATURAL_NUM++;
        }
    LOOP++;
    cout<<endl;
    }
}
