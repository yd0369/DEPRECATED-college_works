package com.yash_desai;
import java.util.Scanner;
public class Pyramid_with_For_loop {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the loop count : ");
        int i=S.nextInt();
        int j,k=i;
        for (int loop = 0; loop < i; loop++) {
            for (j = 1; j < k; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= loop; j++) {
                System.out.print("*");
            }
            for (j = 0; j <= (loop-1); j++) {
                System.out.print("*");
            }
            k--;
            System.out.println();
        }
    }
}