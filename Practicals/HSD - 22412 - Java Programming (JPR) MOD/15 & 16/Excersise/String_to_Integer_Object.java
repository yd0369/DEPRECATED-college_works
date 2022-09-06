package com.yash_desai;
import java.util.Scanner;
import java.lang.Integer;
public class String_to_Integer_Object {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Select the Radix of Input Number : " +
                "\n1. Binary Number      [02]" +
                "\n2. Octal Number       [08]" +
                "\n3. Decimal Number     [10]" +
                "\n4. Hexadecimal Number [16]" +
                "\nEnter the Option : ");
        switch (S.nextByte()) {
            case 1:
                Converter(2);
                break;
            case 2:
                Converter(8);
                break;
            case 3:
                Converter(10);
                break;
            case 4:
                Converter(16);
                break;
            default:
                System.out.println("Invalid Input...");
                break;
        }
    }
    static void Converter(int radix) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String STR = S.next();
        Integer I = null;
        I = I.parseInt(STR, radix);
        System.out.println("Integer Object value : " + I);
    }
}