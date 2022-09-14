package com.yash_desai.AJP_22517.Practical_16.Client_Server_Socket_Demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String User_ID, Password;
        Scanner S = new Scanner(System.in);
        Socket Sck;
        System.out.println(":: Enter your Credentials ::");
        System.out.print("\nUser ID : ");
        User_ID = S.next();
        System.out.print("Password : ");
        Password = S.next();
        try {
            Sck = new Socket("localhost",3);
            DataOutputStream DataOPStream = new DataOutputStream(Sck.getOutputStream());
            DataInputStream DataIPStream = new DataInputStream(Sck.getInputStream());
            DataOPStream.writeUTF(User_ID);
            if(!DataIPStream.readBoolean()) {
                System.out.println("Invalid User ID...");
            }
            else {
                DataOPStream.writeUTF(Password);
                if(!DataIPStream.readBoolean()) {
                    System.out.println("Invalid Password...");
                }
                else {
                    DataOPStream.writeBoolean(true);
                    if(DataIPStream.readBoolean()) {
                        System.out.println("Authenticated");
                    }
                    else {
                        System.out.println("Authentication Failed!!");
                    }
                }
            }
            Sck.close();
        } catch (Exception E) { System.out.println(E); }
    }
}