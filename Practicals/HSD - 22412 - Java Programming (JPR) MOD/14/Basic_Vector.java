package com.yash_desai;
import java.util.Scanner;
import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("How much Element(s) you want to add-in : ");
        int capacity = S.nextInt();
        Vector V = new Vector(capacity);
        Cast_Vector(V);
        Render_Vector(V);
    }
    static void Cast_Vector(Vector X){
        Scanner S = new Scanner(System.in);
        System.out.println("\nEnter the values of Element(s) : ");
        for(int loop=0,MAX=(X.capacity());loop<MAX;loop++) {
            System.out.print("Element #"+loop+" : ");
            X.add(loop,(S.nextInt()));
        }
    }
    static void Render_Vector(Vector X){
        System.out.println("\nDisplaying the values of Element(s) : ");
        for(int loop=0,MAX=(X.capacity());loop<MAX;loop++) {
            System.out.println("Element #"+loop+" : "+X.elementAt(loop));
        }
    }
}