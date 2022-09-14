package com.yash_desai.AJP_22517.DEMO;


public class TEST{
    public static void main(String args[]) {
        int L=0,C=0;
        while (C <= 6) {
            if (L >=100) L-=2;
            else L*=C;
            C++;
        }
        System.out.println(L);
    }
}