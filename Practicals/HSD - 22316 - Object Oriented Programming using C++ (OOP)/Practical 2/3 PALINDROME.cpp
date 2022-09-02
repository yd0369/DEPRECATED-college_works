////////////////////////////////////////////
//  O.O.P. PRACTICAL 2 -[ Question 3 ]    //
//      ----PALINDROME NUMBER----         // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>
using namespace std;
main()
{
	int NUMBER,TEMP,REMAINS,REVERSE=0;
	cout<<"Enter the Number : ";
	cin>>NUMBER;
	TEMP=NUMBER;
	while(TEMP>0)
	{
		REMAINS=TEMP % 10;
		REVERSE=REVERSE*10+REMAINS;
		TEMP=TEMP/10;	
	}
	if(NUMBER==REVERSE)
	{
		cout<<NUMBER<<" is a Palindrome Number.";
	}
	else
	{
		cout<<NUMBER<<" is not a Palindrome Number.";
	}
}

