#include<iostream>
using namespace std;
class base 
{
	public:
		int n1;
		void show()
		{
			cout<<"\n1 = "<<n1;
	
		}
};
class derive : public base
{
	public:
		int n2;
		void show()
		{
			cout<<"\nnnnnn1 = "<<n1;
			cout<<"\nn2 = "<<n2;
		}
};
main()
{
	base b;
	base *b2;
	cout<<"Pinter of base class points to it";
	b2=&b;
	b2->n1=44;
	b2->show();
	derive d;
	cout<<"\n";
	b2=&d;
	b2->n1=66;
	b2->show();
}
