package com.yash_desai;
public class Implicitly {
    public static void main(String[] args) {
        byte   A=127;
        short  B=A;
        int    C=B;
        long   D=C;
        float  E=D;
        double F=E;
        System.out.println("Byte    : [08 Bit] / Current Value : "+A);
        System.out.println("Short   : [16 Bit] / Current Value : "+B);
        System.out.println("Integer : [32 Bit] / Current Value : "+C);
        System.out.println("Long    : [64 Bit] / Current Value : "+D);
        System.out.println("Float   : [32 Bit] / Current Value : "+E);
        System.out.println("Double  : [64 Bit] / Current Value : "+F);
    }
}