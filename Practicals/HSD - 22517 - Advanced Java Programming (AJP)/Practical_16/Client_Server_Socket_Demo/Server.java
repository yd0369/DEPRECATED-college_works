package com.yash_desai.AJP_22517.Practical_16.Client_Server_Socket_Demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        String User_ID = "yash_desai_3";
        String Password = "POP";
        ServerSocket SerSck;
        Socket Sck;
        try {
            SerSck = new ServerSocket(3);
            Sck = SerSck.accept();
            DataOutputStream DataOPStream = new DataOutputStream(Sck.getOutputStream());
            DataInputStream DataIPStream = new DataInputStream(Sck.getInputStream());
            System.out.println("Connected to Client...");
            if(!User_ID.equals(DataIPStream.readUTF())) {
                DataOPStream.writeBoolean(false);
            }
            else {
                DataOPStream.writeBoolean(true);
                if(!Password.equals(DataIPStream.readUTF())) {
                    DataOPStream.writeBoolean(false);
                }
                else {
                    DataOPStream.writeBoolean(true);
                    if(!DataIPStream.readBoolean()) {
                        DataOPStream.writeBoolean(false);
                    }
                    else {
                        DataOPStream.writeBoolean(true);
                    }
                }
            }
            SerSck.close();
            Sck.close();
        }
        catch (Exception E) {
            System.out.println(E);
        }
    }
}