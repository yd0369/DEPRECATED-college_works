package com.yash_desai;
import java.util.Scanner;
public class Alphabetical {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Alphabet : ");
        char ALPHA = S.next().charAt(0);
        if(((ALPHA>'a') && (ALPHA<'z')) || ((ALPHA>'A') && (ALPHA<'Z')))
            switch (ALPHA)
            {
                case 'A': case 'E': case 'I': case 'O': case 'U':
                case 'a': case 'e': case 'i': case 'o': case 'u':
                {
                    System.out.println("It is a Vowel");
                    break;
                }

                default:
                {
                    System.out.println("It is an Consonant");
                    break;
                }
            }
        else System.out.println("Invalid Input");
    }
}
