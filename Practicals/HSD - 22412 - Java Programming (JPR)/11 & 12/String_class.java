package com.yash_desai;
import java.util.Scanner;
import java.lang.String;

public class String_class {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Refer From Table Given [String Class Methods]");
        System.out.print("Enter the Option [1-11] : ");
        switch (S.nextByte())
        {
            case 1:
                CharAt();
                break;
            case 2:
                CompareTO();
                break;
            case 3:
                Equals();
                break;
            case 4:
                Equals_no_cases();
                break;
            case 5:
                Length();
                break;
            case 6:
                Replace();
                break;
            case 7:
                Start_with();
                break;
            case 8:
                Ends_with();
                break;
            case 9:
                IndexOF();
                break;
            case 10:
                SubString();
                break;
            case 11:
                LastIndexOf();
                break;
            default:
                System.out.println("Invalid Input...");
                break;
        }

    }

    static void AskforString()
    {
        System.out.print("Enter the String : ");
    }
    static void AskforString(int i)
    {
        System.out.print("Enter the String [#"+i+"] : ");
    }
    static void MSG_MATCH(int i)
    {
        switch(i)
        {
            case 1:
                System.out.println("String are equal to each other.");
                break;

            case 2:
                System.out.println("String are different from each other.");
                break;

            case 3:
                System.out.println("String Matched with Prefix String.");
                break;

            case 4:
                System.out.println("String Doesn't Matched with Prefix String.");
                break;

            case 5:
                System.out.println("String Matched with Suffix String.");
                break;

            case 6:
                System.out.println("String Doesn't Matched with Suffix String.");
                break;
        }

    }

    static void CharAt()
    {
        Scanner S = new Scanner(System.in);
        AskforString();
        String STR = new String(S.next());
        System.out.print("Enter the Index Position : ");
        System.out.println(STR.charAt(S.nextInt()));
    }
    static void CompareTO()
    {
        Scanner S = new Scanner(System.in);
        AskforString(1);
        String STR1 = S.next();
        AskforString(2);
        String STR2 = S.next();
        if((STR1.compareTo(STR2))==0)
            MSG_MATCH(1);
        else MSG_MATCH(2);
    }
    static void Equals()
    {
        Scanner S = new Scanner(System.in);
        AskforString(1);
        String STR1 = new String(S.next());
        AskforString(2);
        String STR2 = new String(S.next());
        if((STR1.equals(STR2))==true)
            MSG_MATCH(1);
        else MSG_MATCH(2);
    }
    static void Equals_no_cases()
    {
        Scanner S = new Scanner(System.in);
        AskforString(1);
        String STR1 = S.next();
        AskforString(2);
        String STR2 = S.next();
        if((STR1.equalsIgnoreCase(STR2))==true)
            MSG_MATCH(1);
        else MSG_MATCH(2);
    }
    static void Length()
    {
        Scanner S = new Scanner(System.in);
        AskforString();
        String STR = new String(S.next());
        System.out.println("Length of String : "+STR.length());
    }
    static void Replace()
    {
        Scanner S = new Scanner(System.in);
        AskforString();
        String STR = new String(S.next());
        System.out.print("Old Character : ");
        char temp = S.next().charAt(0);
        System.out.print("New Character: ");
        System.out.println("New String : "+
                STR.replace(temp,(S.next().charAt(0))));
    }
    static void Start_with()
    {
        Scanner S = new Scanner(System.in);
        AskforString();
        String STR = S.next();
        System.out.print("Prefix String : ");
        String Prefix = S.next();
        if((STR.startsWith(Prefix))==true)
            MSG_MATCH(3);
        else MSG_MATCH(4);
    }
    static void Ends_with()
    {
        Scanner S = new Scanner(System.in);
        AskforString();
        String STR = S.next();
        System.out.print("Suffix String : ");
        String Suffix = S.next();
        if((STR.endsWith(Suffix))==true)
            MSG_MATCH(5);
        else MSG_MATCH(6);
    }
    static void IndexOF()
    {
        Scanner S = new Scanner(System.in);
        AskforString();
        String STR = S.next();
        System.out.print("Enter the Character/String : ");
        System.out.print("First Character Index Position : "+
                STR.indexOf(S.next()));

    }
    static void SubString()
    {
        Scanner S = new Scanner(System.in);
        AskforString();
        String STR = S.next();
        System.out.print("Enter the Index Position : ");
        System.out.print("New Sub-String : "+
                STR.substring(S.nextInt()));
    }
    static void LastIndexOf()
    {
        Scanner S = new Scanner(System.in);
        AskforString();
        String STR = S.next();
        System.out.print("Enter the Character/String : ");
        System.out.print("Last Character Index Position : "+
                STR.lastIndexOf(S.next()));
    }
}