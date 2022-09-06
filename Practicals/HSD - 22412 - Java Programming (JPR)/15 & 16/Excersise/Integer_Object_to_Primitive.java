package com.yash_desai;
import java.util.Scanner;
import java.lang.Integer;
public class Integer_Object_to_Primitive {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the Integer Object Value : ");
        Integer I = S.nextInt();
        byte B = S.nextByte();
        short s = S.nextShort();
        long L = S.nextLong();
        float F = S.nextFloat();
        double D = S.nextDouble();
        System.out.print("Primitive Datatype Variables Values : "+
        "\nByte   : " + B + 
        "\nShort  : " + s +
        "\nLong   : " + L +
        "\nFloat  : " + F +
        "\nDouble : " + D);
    }
}