package com.yash_desai.AJP_22517.Practical_16.Exercise_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Prime_Server {
    public static void main(String[] args) {
        ServerSocket SerSck;
        Socket Sck;
        try {
            SerSck = new ServerSocket(3);
            Sck = SerSck.accept();
            DataOutputStream DataOPStream = new DataOutputStream(Sck.getOutputStream());
            DataInputStream DataIPStream = new DataInputStream(Sck.getInputStream());
            DataOPStream.writeBoolean(Prime_Check(DataIPStream.read()));
            SerSck.close();
            Sck.close();
        }
        catch (Exception E) {
            System.out.println(E);
        }
    }
    static boolean Prime_Check(int num) {
        boolean CON = false;
        for(int i = 2; i<= num/2;i++)
            if(num % i == 0) { CON = true; break; }
        return !CON;
    }
}