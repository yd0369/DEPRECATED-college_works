package com.yash_desai.AJP_22517.Practical_15;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) throws IOException {
        System.out.print("URL : ");
        URLConnection URLC = new URL(new Scanner(System.in).next()).openConnection();
        System.out.println("Date : "+URLC.getDate());
        System.out.println("Content Type : "+URLC.getContentType());
        System.out.println("Content Length : "+URLC.getContentLength());
    }
}