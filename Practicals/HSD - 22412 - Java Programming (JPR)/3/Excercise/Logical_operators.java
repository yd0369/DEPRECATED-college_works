package com.yash_desai;
import java.util.Scanner;
public class Logical_operators {

    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        byte tmp1,tmp2;
        System.out.print("Enter the Value of A : ");
        tmp1=S.nextByte();
        System.out.print("Enter the Value of B : ");
        tmp2=S.nextByte();
        System.out.print("Enter the Value of C : ");
        logical_operations(tmp1,tmp2,S.nextByte());
    }

    static void logical_operations(byte A,byte B,byte C)
    {
        if((A==B) && (A==C))
            System.out.println("All have Same Values");
        else if((A>B) && (A>C))
            System.out.println("A is having Max Value");
        else if((B>A) && (B>C))
            System.out.println("B is having Max Value");
        else if((C>A) && (C>B))
            System.out.println("C is having Max Value");

        if((A<0) || (B<0) || (C<0))
            System.out.println("Negative Value(s) Detected");
    }
}
