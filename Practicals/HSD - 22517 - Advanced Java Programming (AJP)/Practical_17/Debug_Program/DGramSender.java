package com.yash_desai.AJP_22517.Practical_17.Debug_Program;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DGramSender {
    public static void main(String args[]) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        String str = "Java is Easy!!!";
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),ip,3000);
        ds.send(dp);
        ds.close();
    }
}



