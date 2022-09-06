package com.yash_desai;
class POP {
    float X,Y;
    POP()
    { 
	System.out.println("[Default] Object Created..."); 
    }
    POP(int A,int B)
    { X=A; Y=B; }
    POP(float A,float B)
    { X=A; Y=B; }
}

public class Constructor {
    public static void main(String[] args) {
       	POP P1= new POP();
        POP P2= new POP(2,4);
        POP P3= new POP(2.3f,5.6f);
        System.out.println("P1.X = "+P1.X+"\tP1.Y = "+P1.Y);
        System.out.println("P2.X = "+P2.X+"\tP2.Y = "+P2.Y);
        System.out.println("P3.X = "+P3.X+"\tP3.Y = "+P3.Y);
    }
}