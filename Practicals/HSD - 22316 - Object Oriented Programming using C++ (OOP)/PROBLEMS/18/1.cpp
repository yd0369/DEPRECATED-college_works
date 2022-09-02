#include<iostream>
using namespace std;
main()
{
	int a,*c;
	a=2;
	c=&a;
	cout<<a<<"\t"<<c<<endl;
	cout<<a<<"\t"<<&c<<endl;
	cout<<a<<"\t"<<*c<<endl;
	cout<<&a<<"\t"<<c<<endl;
	cout<<a<<"\t"<<c<<endl;
	
}
