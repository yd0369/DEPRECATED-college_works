package com.yash_desai;
import java.util.Scanner;
class Complex{
    int real_part,imaginary_part;
    Complex(int real_part,int imaginary_part) {
        this.real_part=real_part;
        this.imaginary_part=imaginary_part;
    }
    Complex(int r1,int i1,int r2,int i2) {
        System.out.println("Result : "+(r1+r2)+"+"+(i1+i2)+"i");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int temp;
        System.out.print("[1st Complex Number]"+
                "\n"+"Real Part : ");
        temp=S.nextInt();
        System.out.print("Imaginary Part : ");
        Complex C1 =new Complex(temp,S.nextInt());
        System.out.print("[2nd Complex Number]"+
                "\n"+"Real Part : ");
        temp=S.nextInt();
        System.out.print("Imaginary Part : ");
        Complex C2 =new Complex(temp,S.nextInt());
        Complex C3 =new Complex(C1.real_part,C1.imaginary_part,C2.real_part,C2.imaginary_part);
    }
}