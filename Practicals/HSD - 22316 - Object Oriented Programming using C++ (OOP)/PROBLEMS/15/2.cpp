#include<iostream>
using namespace std;
class base 
{
	public:
		int x;
		void setx(int i)
		{
			x=i;
		}
		int getx()
		{
			return x;
		}
};
class derive : public base
{
	public:
		int y;
		void sety(int i)
		{
			y=i;
		}
		int gety()
		{
			return y;
		}
};
main()
{
	base *p;base
	baseobject; derive
	deriveobject;
	p=&baseobject;
	p->setx(10);
	cout<<"Base ob x : "<<p->getx()<<"\n";
	p=&deriveobject;
	p->setx(99);
	deriveobject.sety(88);
	cout<<"Derive ob x : "<<p->getx()<<"\n";
	cout<<"Derive ob y : "<<deriveobject.gety()<<"\n";
	
	
	
}
