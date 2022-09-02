////////////////////////////////////////////
//  O.O.P. PRACTICAL 17 -[ Question 3 ]   //
//       --  String Comparison  --        //
//      -- Operator Overloading --        // 
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>
#include<cstring>

using namespace std;
class STREAM
{
	public:
		char str_A[30],str_B[30];
		void get_string()
		{
			cout<<"Enter the value of String A : ";
		 	cin>>str_A;
		 	cout<<"Enter the value of String B : ";
		 	cin>>str_B;
		}
		void operator ==(int X)
		{
			if((strcmp(str_A,str_B))==0)
			{
				cout<<endl<<"STRING MATCHED";
			}
			else
			{
				cout<<endl<<"STRING DOESN'T MATCHED";
			}
		}
};

main()
{
	STREAM STR;
	STR.get_string();
	STR==2;
}
