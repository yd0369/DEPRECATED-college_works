package com.yash_desai.AJP_22517.Practical_16.Exercise_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Chat_Server {
    public static void main(String[] args) {
        String Current_User_Name,Fellow_User_Name;
        Scanner S = new Scanner(System.in);
        ServerSocket SerSck;
        Socket Sck;
        System.out.print("\nUser Name : ");
        Current_User_Name = S.next();
        try {
            SerSck = new ServerSocket(3);
            Sck = SerSck.accept();
            DataOutputStream DataOPStream = new DataOutputStream(Sck.getOutputStream());
            DataInputStream DataIPStream = new DataInputStream(Sck.getInputStream());
            Fellow_User_Name = DataIPStream.readUTF();
            DataOPStream.writeUTF(Current_User_Name);
            System.out.println("\n\nConnected with "+Fellow_User_Name+"\n\n");
            for(int i = 1;i<11;i++) {
                System.out.println(Fellow_User_Name + " > " +DataIPStream.readUTF());
                System.out.print("You > ");
                DataOPStream.writeUTF(S.next());
            }
            SerSck.close();
            Sck.close();
        }
        catch (Exception E) {
            System.out.println(E);
        }
    }
}