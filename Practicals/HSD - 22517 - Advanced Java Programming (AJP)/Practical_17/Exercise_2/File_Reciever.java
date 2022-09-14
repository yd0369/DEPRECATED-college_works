package com.yash_desai.AJP_22517.Practical_17.Exercise_2;

import java.io.File;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

public class File_Reciever {
    public static void main(String args[]) {
        byte[] Raw_Bytes = new byte[102400];
        Scanner S = new Scanner(System.in);
        DatagramSocket Sock;
        DatagramPacket Pckt;
        File file;
        FileOutputStream FileOPStream;
        try {
            Sock = new DatagramSocket(333);
            System.out.println("Waiting for the arrival of file data....");
            Pckt = new DatagramPacket(Raw_Bytes,Raw_Bytes.length);
            Sock.receive(Pckt);
            System.out.print("Data Received... \n\n" +
                    "[Save] File Directory : ");
            file = new File(S.next());
            FileOPStream=new FileOutputStream(file);
            FileOPStream.write(Pckt.getData(),0,Pckt.getLength());
            FileOPStream.close();
            System.out.println("\nFile Successfully saved....\n\n");
            Sock.close();
        }
        catch (Exception E) {
            E.printStackTrace();
        }
    }
}