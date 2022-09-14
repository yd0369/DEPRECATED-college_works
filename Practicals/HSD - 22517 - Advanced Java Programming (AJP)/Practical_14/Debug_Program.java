package com.yash_desai.AJP_22517.Practical_14;

import java.net.InetAddress;

public class Debug_Program {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("localhost");
            System.out.println("Host Name: "+ip.getHostName());
            System.out.println("IP Address: "+ip.getHostAddress());
        }
        catch(Exception E) {
            System.out.println(E);
        }
    }
}
