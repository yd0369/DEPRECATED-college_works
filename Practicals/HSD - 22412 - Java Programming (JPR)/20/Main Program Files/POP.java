package com.yash_desai;
import java.util.Scanner;
import com.akarin_corp.Akari;
public class POP {
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        Akari A = new Akari();
        System.out.print("Enter the value of First Operand : ");
        A.setFirst_Operand(S.nextDouble());
        System.out.print("Enter the value of Second Operand : ");
        A.setSecond_Operand(S.nextDouble());
        System.out.println("\nAddition       : "+A.Addition()+
                "\nSubtraction    : "+A.Subtraction()+
                "\nMultiplication : "+A.Multiplication()+
                "\nDivision       : "+A.Division()+
                "\nModulus        : "+A.Modulus());
    }

}
