package com.yash_desai;
import java.util.Scanner;
public class If_with_For_loop {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the loop count : ");
        int i=S.nextInt();
        System.out.print("Enter the Order [A/D] : ");
        char order=S.next().charAt(0);
        if(order=='A')
            for (int loop = 1; loop <= i; loop++) {
                System.out.println(loop);
            }
        else if(order=='D')
            for (int loop = i; loop >= 1; loop--) {
                System.out.println(loop);
            }
        else
            System.out.println("Invalid Input");
    }
}

