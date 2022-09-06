package com.yash_desai;
import java.util.Scanner;
public class If_Statements {

    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);

        System.out.print("[If Statement] "+"Enter [0] : ");
        if_statement(S.nextByte());

        System.out.print("[If-Else Statement] "+"Enter [0] : ");
        if_else_statement(S.nextByte());

        System.out.print("[Nested-If Statement] "+"Enter [0/1] : ");
        nested_if_statement(S.nextByte());

        System.out.print("[If-Else-If Ladder Statement] "+"Enter [0/1] : ");
        else_if_ladder_statement(S.nextByte());
    }

    static void if_statement(byte input)
    {
        if(input==0)
            System.out.println("You Entered 0");
        if(input!=0)
            System.out.println("You Have entered anything else.");
    }

    static void if_else_statement(byte input)
    {
        if(input==0)
            System.out.println("You Entered 0");
        else
            System.out.println("You Have entered anything else.");
    }

    static void nested_if_statement(byte input)
    {
        if(true)
        {
            if(input==0)
                System.out.println("You Entered 0");
            if(input==1)
                System.out.println("You Entered 1");
            if((input!=0)&&(input!=1))
                System.out.println("You Have entered anything else.");
        }
    }

    static void else_if_ladder_statement(byte input)
    {
        if(input==0)
            System.out.println("You Entered 0");
        else if(input==1)
            System.out.println("You Entered 1");
        else
            System.out.println("You Have entered anything else.");
    }
}
