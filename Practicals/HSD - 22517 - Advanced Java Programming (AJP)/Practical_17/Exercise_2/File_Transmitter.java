package com.yash_desai.AJP_22517.Practical_17.Exercise_2;

import java.io.File;
import java.io.FileInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class File_Transmitter {
    public static void main(String args[]) {
        byte[] Raw_Bytes = new byte[102400];
        Scanner S = new Scanner(System.in);
        InetAddress IP;
        DatagramSocket Sock;
        DatagramPacket Pckt;
        int File_Size_Bytes_Count;
        File file;
        FileInputStream FileIPStream;
        try {
            Sock = new DatagramSocket();
            IP = InetAddress.getByName("127.0.0.1");
            System.out.print("[Transmit] File Directory : ");
            file = new File(S.next());
            FileIPStream = new FileInputStream(file);
            File_Size_Bytes_Count = 0;
            while(FileIPStream.available()!=0) {
                Raw_Bytes[File_Size_Bytes_Count]=(byte)FileIPStream.read();
                File_Size_Bytes_Count++;
            }
            FileIPStream.close();
            System.out.println("Successfully Read the File....");
            Pckt = new DatagramPacket(Raw_Bytes,File_Size_Bytes_Count,IP,333);
            Sock.send(Pckt);
            System.out.println("Departure of File data ["+File_Size_Bytes_Count+" bytes] successfully completed....");
            Sock.close();
        }
        catch(Exception E) { E.printStackTrace(); }
    }
}