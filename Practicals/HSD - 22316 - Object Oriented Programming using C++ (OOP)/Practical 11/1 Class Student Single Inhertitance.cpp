////////////////////////////////////////////
//  O.O.P. PRACTICAL 11 -[ Question 1 ]   //
// -- Class Student Single Inhertitance-- // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>
using namespace std;
class Student
{
	private:
		int roll_no;
		char name[20];
		
	public:	
	    void get_data()
		{
			cout<<"Enter the Student Roll Number : ";
		 	cin>>roll_no;
			cout<<"Enter the Student Name : ";
			cin>>name;
		}
		void put_data()
		{
			cout<<endl<<"Student Roll Number : "<<roll_no<<endl;
			cout<<"Student Name : "<<name<<endl<<endl;
		}		
};
class Marks : public Student
{
	private:
		double m1,m2,m3,total,percentage;
		void get_data2()
		{
			cout<<"Enter the M-1 Marks [out of 100] : ";
		 	cin>>m1;
		 	cout<<"Enter the M-2 Marks [out of 100] : ";
		 	cin>>m2;
		 	cout<<"Enter the M-3 Marks [out of 100] : ";
		 	cin>>m3;
		 	total=m1+m2+m3;
			percentage=(total/300)*100;
		}
		void put_data2()
		{
			cout<<"M-1 Marks  : "<<m1<<" out of 100"<<endl;
			cout<<"M-2 Marks  : "<<m2<<" out of 100"<<endl;
		 	cout<<"M-3 Marks  : "<<m3<<" out of 100"<<endl;
		 	cout<<"Total Marks  : "<<total<<" out of 300"<<endl;
		 	cout<<"Percentage  : "<<percentage;
		}	
		
	public:	
	    Marks()
		{
			cout<<"Getting Data :"<<endl;
			get_data();
			get_data2();
			cout<<":::::::::::::::"<<endl;
			cout<<"Putting Data :"<<endl;
			put_data();
			put_data2();
		}	
};
main()
{
	Marks MACH;
}
