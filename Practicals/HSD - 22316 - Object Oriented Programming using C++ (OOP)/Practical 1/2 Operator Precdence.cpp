////////////////////////////////////////////
//  O.O.P. PRACTICAL 1 -[ Question 2 ]    //
//       ----Operator Precedence----      // 
//                                        //
//              YASH DESAI                //
////////////////////////////////////////////

#include<iostream>
using namespace std;
main()
{
	int A,B,C,D;
	cout<<"Enter the value of A : ";
	cin>>A;
	cout<<"Enter the value of B : ";
	cin>>B;
	cout<<"Enter the value of C : ";
	cin>>C;
	cout<<"Enter the value of D : ";
	cin>>D;
	cout<<endl<<endl<<endl;
	cout<<"(    A *     B   +   C     * D    ) : "<<(A*B+C*D)<<endl;
	cout<<"( (  A *     B ) +   C     * D    ) : "<<((A*B)+C*D)<<endl;
	cout<<"(    A *  (  B   +   C )   * D    ) : "<<(A*(B+C)*D)<<endl;
	cout<<"(    A *     B   + ( C     * D  ) ) : "<<(A*B+(C*D))<<endl;
	cout<<"( (  A *     B ) + ( C     * D  ) ) : "<<((A*B)+(C*D))<<endl;
	cout<<"( (( A *     B ) +   C   ) * D    ) : "<<(((A*B)+C)*D)<<endl;
	cout<<"( (  A *  (  B   +   C ) ) * D    ) : "<<((A*(B+C))*D)<<endl;
	cout<<"( (  A *     B   +   C   ) * D    ) : "<<((A*B+C)*D)<<endl;
	cout<<"(    A *  (( B   +   C )   * D  ) ) : "<<(A*((B+C)*D))<<endl;
	cout<<"(    A *  (  B   + ( C     * D )) ) : "<<(A*(B+(C*D)))<<endl;
	cout<<"(    A *  (  B   +   C     * D  ) ) : "<<(A*(B+C*D))<<endl;
}


