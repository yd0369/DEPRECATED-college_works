package com.yash_desai;
import java.util.Scanner;
public class Seasons {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Month Name [in Initcap] : ");
        String STR = S.next();
        switch (STR) {
            case "January": case "February": case "March": {
                System.out.println("Autumn/Spring Season");
                break;
            }
            case "April": case "May": case "June": {
                System.out.println("Summer Season");
                break;
            }
            case "July": case "August": case "September": {
                System.out.println("Monsoon/Rainy Season");
                break;
            }
	    case "October": case "November": case "December": {
                System.out.println("Winter Season");
                break;
            }
            default: {
                System.out.println("Invalid Input");
                break;
            }
        }
    }
}
