package com.yash_desai.AJP_22517.Practical_17.Exercise_1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Transciever_A {
    public static void main(String args[]) {
        byte[] Raw_Bytes = new byte[200];
        Scanner S = new Scanner(System.in);
        InetAddress IP;
        DatagramSocket Sock;
        DatagramPacket Pckt;
        System.out.print("User Name : ");
        String Current_User_Name = S.next(), Fellow_User_Name;
        try {
            Sock = new DatagramSocket();
            IP = InetAddress.getByName("127.0.0.1");
            Raw_Bytes = Current_User_Name.getBytes();
            Pckt = new DatagramPacket(Raw_Bytes, Raw_Bytes.length, IP, 333);
            Sock.send(Pckt);
            Pckt = new DatagramPacket(Raw_Bytes, Raw_Bytes.length);
            Sock.receive(Pckt);
            Fellow_User_Name = new String(Pckt.getData(), 0, Pckt.getLength());
            System.out.println("\nDiscovered " + Fellow_User_Name + "....\n\n");
            for (int i = 1; i < 30; i++) {
                System.out.print("You : ");
                Raw_Bytes = S.next().getBytes();
                Pckt = new DatagramPacket(Raw_Bytes, Raw_Bytes.length, IP, 333);
                Sock.send(Pckt);
                Pckt = new DatagramPacket(Raw_Bytes, Raw_Bytes.length);
                Sock.receive(Pckt);
                System.out.println(Fellow_User_Name + " : " + new String(Raw_Bytes, 0, Raw_Bytes.length));
            }
            Sock.close();
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
}