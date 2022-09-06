package com.yash_desai;
import java.util.Scanner;
import let_me_calculate.calculator;
public class POP {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        calculator C = new calculator();
        System.out.print("Enter the value of A : ");
        int temp = (S.nextInt());
        System.out.print("Enter the value of B : ");
        System.out.println("Sum [A+B] : "+C.add(temp, (S.nextInt())));
    }
}
