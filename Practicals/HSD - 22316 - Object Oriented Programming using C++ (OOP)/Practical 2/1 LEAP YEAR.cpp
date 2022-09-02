////////////////////////////////////////////
//  O.O.P. PRACTICAL 2 -[ Question 1 ]    //
//          ----LEAP YEAR----             // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>
using namespace std;
main()
{
	int Year;
	cout<<"Enter the Year : ";
	cin>>Year;
	cout<<endl<<endl<<endl;
	if(( Year % 100 != 0 && Year % 4 == 0) || Year % 400 == 0 )
	{
		cout<<Year<<" is a Leap Year.";
	}
	else
	{
		cout<<Year<<" is not Leap Year.";
	}
}
