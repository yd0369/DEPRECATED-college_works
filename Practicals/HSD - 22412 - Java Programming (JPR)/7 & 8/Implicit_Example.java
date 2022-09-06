package com.yash_desai;
import java.util.Scanner;
public class Implicit_Example {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the value of A [-128 ~ 127] : ");
        byte A=S.nextByte();
        System.out.print("Enter the value of B [-128 ~ 127] : ");
        byte B=S.nextByte();
        int C= A+B;
        System.out.println("Result [A+B] = "+C);
    }
}