package com.yash_desai;
import java.util.Scanner;
public class Do_while_loop_with_logic_ops {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the loop count : ");
        int i=S.nextInt();
        System.out.print("Enter [1] : ");
        int tmp = S.nextInt();
        do {
                System.out.println("LOOP RUN LEFT : "+i);
                i--;
        } while((i>=1)&&(tmp==1));
    }
}