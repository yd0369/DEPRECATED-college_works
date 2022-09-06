package com.yash_desai;
import java.awt.*;
import java.applet.*;
import java.util.Scanner;
public class myAPPLET extends Applet{
    public void paint(Graphics g) {
        Scanner S = new Scanner(System.in);
        System.out.print("1. Square Inside a circle" +
                "\n2. Circle Inside a Square" +
                "\nEnter the Option : ");
        switch(S.nextByte()) {
            case 1:
                g.drawRect(50, 50, 200, 200);
                g.drawOval(50, 50, 200, 200);
                break;
            case 2:
                g.drawRect(80, 80, 140, 140);
                g.drawOval(50, 50, 200, 200);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
