////////////////////////////////////////////
//  O.O.P. PRACTICAL 1 -[ Question 1 ]    //
//     ----Quadratic Equation----         // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>
using namespace std;
main()
{
	int A,B,C;
	cout<<"Enter the value of A : ";
	cin>>A;
	cout<<"Enter the value of B : ";
	cin>>B;
	cout<<"Enter the value of C : ";
	cin>>C;
	cout<<endl<<endl<<endl<<endl;
	cout<<"The roots of the following Quadratic Equqation are :";
	cout<<endl<<"Root 1 :";
	cout<<((-B+((B*B)-((4*A*C)^(1/2))))/(2*A));
	cout<<endl<<"Root 2 :";
	cout<<((-B-((B*B)-((4*A*C)^(1/2))))/(2*A));
}
