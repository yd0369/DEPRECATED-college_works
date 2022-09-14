package com.yash_desai.AJP_22517.Practical_16.Exercise_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Chat_Client {
    public static void main(String[] args) {
        String Current_User_Name,Fellow_User_Name;
        Scanner S = new Scanner(System.in);
        Socket Sck;
        System.out.print("\nUser Name : ");
        Current_User_Name = S.next();
        try {
            Sck = new Socket("localhost",3);
            DataOutputStream DataOPStream = new DataOutputStream(Sck.getOutputStream());
            DataInputStream DataIPStream = new DataInputStream(Sck.getInputStream());
            DataOPStream.writeUTF(Current_User_Name);
            Fellow_User_Name = DataIPStream.readUTF();
            System.out.println("\n\nConnected with "+Fellow_User_Name+"\n\n");
            for(int i = 1;i<11;i++) {
                System.out.print("You > ");
                DataOPStream.writeUTF(S.next());
                System.out.println(Fellow_User_Name + " > " +DataIPStream.readUTF());
            }
            Sck.close();
        } catch (Exception E) { System.out.println(E); }
    }
}