#include<iostream>
using namespace std;
class Base
{
	public:
		virtual void print() const = 0;
};
class Derivedone : public Base
{
	public:
		void print() const
		{
			cout << "Derivedone\n";
		}
};
class DerivedTwo : public Base
{
	public:
		void print() const
		{
			cout << "Derived Two \n";
		}
};
class Multiple : public Derivedone, public DerivedTwo
{
	public:
		void print() const
		{
			DerivedTwo :: print();
		}
};
main()
{
	int i;
	Derivedone one;
	DerivedTwo two;
	Multiple both;
	Base *array[3];
	array[0]=&both;
	array[1]=&one;
	array[2]=&two:
	array[i]->print();
}
