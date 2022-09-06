package com.yash_desai;
import java.util.Scanner;
public class Explicitly {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        {   System.out.print("Enter the value for byte : ");
            byte A = S.nextByte();
            System.out.println(
            "\n" + "Byte : " + A + " -> Byte    : " + (byte) A +
            "\n" + "Byte : " + A + " -> Short   : " + (short) A +
            "\n" + "Byte : " + A + " -> Integer : " + (int) A +
            "\n" + "Byte : " + A + " -> Long    : " + (long) A +
            "\n" + "Byte : " + A + " -> Float   : " + (float) A +
            "\n" + "Byte : " + A + " -> Double  : " + (double) A +
            "\n-----------------------------------"); }
        {   System.out.print("Enter the value for short : ");
            short A = S.nextShort();
            System.out.println(
            "\n" + "Short : " + A + " -> Byte    : " + (byte) A +
            "\n" + "Short : " + A + " -> Short   : " + (short) A +
            "\n" + "Short : " + A + " -> Integer : " + (int) A +
            "\n" + "Short : " + A + " -> Long    : " + (long) A +
            "\n" + "Short : " + A + " -> Float   : " + (float) A +
            "\n" + "Short : " + A + " -> Double  : " + (double) A+
                    "\n-----------------------------------"); }
        {   System.out.print("Enter the value for integer : ");
            int A = S.nextInt();
            System.out.println(
            "\n" + "Integer : " + A + " -> Byte    : " + (byte) A +
            "\n" + "Integer : " + A + " -> Short   : " + (short) A +
            "\n" + "Integer : " + A + " -> Integer : " + (int) A +
            "\n" + "Integer : " + A + " -> Long    : " + (long) A +
            "\n" + "Integer : " + A + " -> Float   : " + (float) A +
            "\n" + "Integer : " + A + " -> Double  : " + (double) A+
                    "\n-----------------------------------"); }
        {   System.out.print("Enter the value for long : ");
            long A = S.nextLong();
            System.out.println(
            "\n" + "Long : " + A + " -> Byte    : " + (byte) A +
            "\n" + "Long : " + A + " -> Short   : " + (short) A +
            "\n" + "Long : " + A + " -> Integer : " + (int) A +
            "\n" + "Long : " + A + " -> Long    : " + (long) A +
            "\n" + "Long : " + A + " -> Float   : " + (float) A +
            "\n" + "Long : " + A + " -> Double  : " + (double) A+
                    "\n-----------------------------------"); }
        {   System.out.print("Enter the value for float : ");
            float A = S.nextFloat();
            System.out.println(
            "\n" + "Float : " + A + " -> Byte    : " + (byte) A +
            "\n" + "Float : " + A + " -> Short   : " + (short) A +
            "\n" + "Float : " + A + " -> Integer : " + (int) A +
            "\n" + "Float : " + A + " -> Long    : " + (long) A +
            "\n" + "Float : " + A + " -> Float   : " + (float) A +
            "\n" + "Float : " + A + " -> Double  : " + (double) A+
                    "\n-----------------------------------"); }
        {   System.out.print("Enter the value for double : ");
            double A = S.nextDouble();
            System.out.println(
            "\n" + "Double : " + A + " -> Byte    : " + (byte) A +
            "\n" + "Double : " + A + " -> Short   : " + (short) A +
            "\n" + "Double : " + A + " -> Integer : " + (int) A +
            "\n" + "Double : " + A + " -> Long    : " + (long) A +
            "\n" + "Double : " + A + " -> Float   : " + (float) A +
            "\n" + "Double : " + A + " -> Double  : " + (double) A+
                    "\n-----------------------------------"); }
    }
}