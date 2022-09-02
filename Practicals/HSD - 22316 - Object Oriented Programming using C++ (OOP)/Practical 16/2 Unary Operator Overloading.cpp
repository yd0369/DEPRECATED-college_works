////////////////////////////////////////////
//  O.O.P. PRACTICAL 16 -[ Question 0 ]   //
//       -- Operator Overloading --       // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>
using namespace std;
class Time  
{  
	private:
    	int hrs,min,sec;  
    public:
	Time operator>>(Time &TOB)
	{
		cout<< " Hour : ";
		cin>>TOB.hrs;
		cout<< " Minute : ";
		cin>>TOB.min;
		cout<< " Seconds : ";
		cin>>TOB.sec;
	}
   	Time operator<<(Time &TOB)
   {
    	cout<<endl<<"Time ->> "
		    <<TOB.hrs
    	    <<" Hours"
			<<" : "
			<<TOB.min
			<<" Minutes"
			<<" : "
			<<TOB.sec
			<<" Seconds";
	}
};  
    
main()  
{  
	Time T;
	T.operator>>(T);
	T.operator<<(T);  
}  

