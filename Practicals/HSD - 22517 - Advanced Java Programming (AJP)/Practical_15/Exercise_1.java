package com.yash_desai.AJP_22517.Practical_15;

import java.net.MalformedURLException;
import java.net.URL;

public class Exercise_1 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://www.msbte.org.in");
        System.out.println("Host : "+url.getHost());
        System.out.println("Protocol : "+url.getProtocol());
        System.out.println("Port : "+url.getPort());
        System.out.println("File : "+url.getFile());
    }
}
