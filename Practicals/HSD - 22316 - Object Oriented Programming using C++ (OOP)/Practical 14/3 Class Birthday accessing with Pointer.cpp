////////////////////////////////////////////
//  O.O.P. PRACTICAL 14 -[ Question 3 ]   //
//  -- Classes ,Objects and Pointer --    // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>
using namespace std;
class Birthday
{
	private:
		int day,month,year;
		
	public:	
		void get()
		{
			cout<<"Enter the Date : ";
		 	cin>>day;
			cout<<"Enter the Month : ";
			cin>>month;
			cout<<"Enter the Year : ";
			cin>>year;
		}	
};
main()
{
	int i;
	Birthday B1[5],*B2;
	for(i=0;i<5;i++)
	{
		cout<<endl<<"Info Intake #"<<(i+1)<<endl;
		B2=&B1[i];
		B2->get();
	}
}
