////////////////////////////////////////////
//  O.O.P. PRACTICAL 13 -[ Question 1 ]   //
// 		 --Multiple Inhertitance--        // 
// --Class area,perimeter and rectangle-- //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>
using namespace std;
class Area
{
	public:
		double area(double length,double breadth)
		{
			return (length*breadth);
		}		
};
class Perimeter
{
	public:
		double perimeter(double length,double breadth)
		{
			return (2*(length+breadth));
		}
};
class rectangle : public Area,public Perimeter
{
	private:
		double LENGTH,BREADTH;
		
	public:	
	    void get_data()
		{
			cout<<endl<<"Enter the Rectangle Length : ";
			cin>>LENGTH;
			cout<<endl<<"Enter the Rectangle Breath : ";
			cin>>BREADTH;
		}
		void display()
		{
			cout<<endl<<"Area of Rectangle : "<<area(LENGTH,BREADTH);
			cout<<endl<<"Perimeter of Rectangle : "<<perimeter(LENGTH,BREADTH);
		}
		rectangle()
		{
			get_data();
			display();
		}
			
};
main()
{
	rectangle Y;
}
