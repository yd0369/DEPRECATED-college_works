////////////////////////////////////////////
//  O.O.P. PRACTICAL 12 -[ Question 1 ]   //
// 		--Multilevel Inhertitance--       // 
//--Class Person,Employee and Programmer--//
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>
using namespace std;
class person
{
	private:
		char name[20],gender;
		int age;
		
	public:	
	    void get_data()
		{
			cout<<"Enter the Name : ";
		 	cin>>name;
			cout<<"Enter the Gender [M or F] : ";
			cin>>gender;
			cout<<"Enter the Age : ";
			cin>>age;
		}
		void put_data()
		{
			cout<<"Name : "<<name<<endl;
			cout<<"Gender : ";
			if(gender=='M'){cout<<"Male";}
			else{cout<<"Female";}
			cout<<endl<<"Age : "<<age<<endl;
		}		
};
class employee : public person
{
	private:
		int emp_id;
		double salary;
		char company[30];
	
	public:
		void get_data2()
		{
			cout<<"Enter the Employee ID : ";
		 	cin>>emp_id;
		 	cout<<"Enter the Salary : ";
		 	cin>>salary;
		 	cout<<"Enter the Company : ";
		 	cin>>company;
		}
		void put_data2()
		{
			cout<<"Employee ID : "<<emp_id<<endl;
		 	cout<<"Salary : "<<salary<<endl;
		 	cout<<"Company : "<<company<<endl;
		}
};
class programmer : public employee
{
	private:
		int no_of_prog_lang_known;
		
		void get_data3()
		{
			cout<<"Programming Languages Known : ";
		 	cin>>no_of_prog_lang_known;
		}
		void put_data3()
		{
			cout<<"Programming Languages Known : "<<no_of_prog_lang_known;
		}
		
	public:	
	    programmer()
		{
			cout<<"Getting Data :"<<endl;
			get_data();
			get_data2();
			get_data3();
			cout<<endl<<":::::::::::::::"<<endl;
			cout<<"Putting Data :"<<endl;
			put_data();
			put_data2();
			put_data3();
		}	
};
main()
{
	programmer PRO;
}
