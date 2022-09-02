////////////////////////////////////////////
//  O.O.P. PRACTICAL 18 -[ Question 2 ]   //
//       --  2D-3D DISTANCES  --          //
//     -- Functions Overloading --        // 
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>
#include<cmath>
using namespace std;
void DISTANCE(double X1,double X2,double Y1,double Y2,double Z1,double Z2)
{
	cout<<"DISTANCE BETWEEN 3D Points : "
	<<(sqrt((pow((X2-X1),2))+(pow((Y2-Y1),2))+(pow((Z2-Z1),2))));
}
void DISTANCE(double X1,double Y1,double X2,double Y2)
{
	cout<<"DISTANCE BETWEEN 2D Points : "
	<<(sqrt((pow((X2-X1),2))+(pow((Y2-Y1),2))));
}
main()
{
	double X1,Y1,Z1,X2,Y2,Z2;
	cout<<"Enter 2-Dimensional Points Co-Ordinates :\n\n"
	<<"First Point :\n";
	cout<<"X : ";
	cin>>X1;
	cout<<"Y : ";
	cin>>Y1;
	cout<<"\nSecond Point :\n";
	cout<<"X : ";
	cin>>X2;
	cout<<"Y : ";
	cin>>Y2;
	cout<<"-------------------------------------------\n";
	DISTANCE(X1,X2,Y1,Y2);
	cout<<"\n-------------------------------------------";
	cout<<"\n\n\nEnter 3-Dimensional Points Co-Ordinates :\n\n"
	<<"First Point :\n";
	cout<<"X : ";
	cin>>X1;
	cout<<"Y : ";
	cin>>Y1;
	cout<<"Z : ";
	cin>>Z1;
	cout<<"\nSecond Point :\n";
	cout<<"X : ";
	cin>>X2;
	cout<<"Y : ";
	cin>>Y2;
	cout<<"Z : ";
	cin>>Z2;
	cout<<"-------------------------------------------\n";
	DISTANCE(X1,X2,Y1,Y2,Z1,Z2);
	cout<<"\n-------------------------------------------";
}
