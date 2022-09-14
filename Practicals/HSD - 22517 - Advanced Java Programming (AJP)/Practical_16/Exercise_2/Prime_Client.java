package com.yash_desai.AJP_22517.Practical_16.Exercise_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Prime_Client {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        Socket Sck;
        try {
            Sck = new Socket("localhost",3);
            DataOutputStream DataOPStream = new DataOutputStream(Sck.getOutputStream());
            DataInputStream DataIPStream = new DataInputStream(Sck.getInputStream());
            System.out.print("\nEnter Number : ");
            DataOPStream.write(S.nextInt());
            System.out.println("It is " + (DataIPStream.readBoolean() ? "" : "not " )+"a Prime Number");
            Sck.close();
        } catch (Exception E) { System.out.println(E); }
    }
}