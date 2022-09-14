package com.yash_desai.AJP_22517.Practical_14;

import java.net.InetAddress;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        try {
            System.out.print("Enter the Host Name : ");
            InetAddress ip = InetAddress.getByName(new Scanner(System.in).next());
            System.out.println("IP Address: "+ip.getHostAddress());
        }
        catch(Exception E) {
            System.out.println(E);
        }
    }
}