package com.yash_desai;
import java.awt.*;
import java.applet.*;
import java.util.Scanner;
public class myAPPLET extends Applet{
    public void paint(Graphics G) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the number of Vertices : ");
        int POINT = S.nextInt();
        int[] X = new int[POINT];
        int[] Y = new int[POINT];

        //int[] X = {10,100,200,20};
        //int[] Y = {100,10,20,200};
        for(int i=0;i<(POINT);i++) {
            System.out.print("Enter Point#"+(i+1)+" : X : ");
            X[i] = S.nextInt();
            System.out.print("Enter Point#"+(i+1)+" : Y : ");
            Y[i] = S.nextInt();
        }
        System.out.println("Plotting Points...");
        G.drawPolygon(X,Y,POINT);
    }
}