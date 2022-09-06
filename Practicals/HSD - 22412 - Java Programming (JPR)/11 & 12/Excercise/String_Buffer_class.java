package com.yash_desai;
import java.util.Scanner;
import java.lang.StringBuffer;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Refer Given Table " +
                "[String Buffer Class Methods]");
        System.out.print("Enter the Option [1-5] : ");
        switch(S.nextByte())
        {
            case 1:
                String_Buff_Append();
                break;
            case 2:
                String_Buff_Insert();
                break;
            case 3:
                String_Buff_Set_Length();
                break;
            case 4:
                String_Buff_Set_CharAt();
                break;
            case 5:
                String_Buff_Reverse();
                break;
            default:
                System.out.println("Invalid Input...");
                break;
        }
    }
    static void String_Buff_Append(){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the First String : ");
        StringBuffer STRBUFF = new StringBuffer(S.next());
        System.out.print("Enter the Second String : ");
        StringBuffer STRBUFF2 = new StringBuffer(S.next());
        STRBUFF.append(STRBUFF2);
        System.out.println("After Appendding :");
        System.out.println("String #1 : "+STRBUFF+
                "\nString #2 : "+STRBUFF2);
    }
    static void String_Buff_Insert(){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the String : ");
        StringBuffer STRBUFF = new StringBuffer(S.next());
        System.out.print("Enter the Index Position [Offset] : ");
        int temp = S.nextInt();
        System.out.print("Enter the String to Insert : ");
        STRBUFF.insert(temp,S.next());
        System.out.println("Modified String : "+STRBUFF);
    }
    static void String_Buff_Set_Length(){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the String : ");
        StringBuffer STRBUFF = new StringBuffer(S.next());
        System.out.print("Enter the New Length : ");
        STRBUFF.setLength(S.nextInt());
        System.out.println("Modified String : "+STRBUFF);
    }
    static void String_Buff_Set_CharAt(){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the String : ");
        StringBuffer STRBUFF = new StringBuffer(S.next());
        System.out.print("Enter the Index Position : ");
        int temp = S.nextInt();
        System.out.print("Enter the Character/String to Insert : ");
        STRBUFF.insert(temp,S.next());
        System.out.println("Modified String : "+STRBUFF);
    }
    static void String_Buff_Reverse(){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the String : ");
        StringBuffer STRBUFF = new StringBuffer(S.next());
        STRBUFF.reverse();
        System.out.println("Reversed String : "+STRBUFF);
    }
}