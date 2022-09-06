package com.yash_desai;
public class Explicit_Unicode {
    public static void main(String[] args) {
        for(int i=0;i<=1114112;i++)
            System.out.println(i+" : "+(Integer.toHexString(i))+" : "+(char)i);
    }
}