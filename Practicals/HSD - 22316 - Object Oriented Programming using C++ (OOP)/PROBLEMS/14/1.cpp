#include<iostream>
using namespace std;
class Time
{
short int hh, mm,ss;
public: 
Time()
{
hh = mm = ss = 0;
}
void getdata (int i, int j, int k)
{
hh = i;
mm = j;
ss = k;
}
void prndata (void)
{
cout<<"\nTime is "<<hh<<":"<<mm<<":"<<ss<<"\n";
}
};
main()
{
Time T1, *tptr;
cout<<"Initializing data members using the object, with values 12, 22, 11\n";
T1.getdata (12,22,11);
cout<<"Printing members using the object pointer";
T1.prndata();
tptr = &T1;
cout<<"Printing members using the object pointer ";
tptr->prndata();
cout<<"\nInitializing data members using the object pointer, with values 15, 10, 16\n";
tptr->getdata (15, 10, 16);
cout<<"printing members using the object";
T1.prndata();
cout<<"Printing members using the object pointer "; 
tptr->prndata();
}
