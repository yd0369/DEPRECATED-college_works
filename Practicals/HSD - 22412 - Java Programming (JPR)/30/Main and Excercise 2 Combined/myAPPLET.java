package com.yash_desai;
import java.awt.*;
import java.applet.*;
import java.util.Scanner;

public class myAPPLET extends Applet{
    public void paint(Graphics G) {
        Scanner S = new Scanner(System.in);
        System.out.print("1. Cone"+
         "\n2. Cylinder" + "\n3. Cube" +
         "\nEnter the Option [1-3] : ");
        switch(S.nextByte()) {
            case 1:
                DrawCone(G);
                break;
            case 2:
                DrawCylinder(G);
                break;
            case 3:
                DrawCube(G);
                break;
            default:
                System.out.println("Invalid Input.");
                break;
        }
    }
    public void DrawCone(Graphics G) {
        G.drawLine(150,0,0,400);       //Line 1
        G.drawLine(150,0,300,400);     //Line 2
        G.drawOval(0,350,300,100); //Oval
    }
    public void DrawCylinder(Graphics G) {
        G.drawLine(50,50,50,450);       //Line 1
        G.drawLine(250,50,250,450);     //Line 2
        G.drawOval(50,0,200,100);   //Oval 1
        G.drawOval(50,400,200,100); //Oval 2
    }
    public void DrawCube(Graphics G) {
        G.drawLine(50,50,200,200);       //Line 1
        G.drawLine(50,250,200,400);      //Line 2
        G.drawLine(250,250,400,400);     //Line 3
        G.drawLine(250,50,400,200);      //Line 4
        G.drawRect(50,50,200,200);   //Cube 1
        G.drawRect(200,200,200,200); //Cube 2
    }
}