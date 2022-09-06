package com.yash_desai;
import java.util.Scanner;
class ROOM{
    private double length,breadth,height;
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getBreadth() {
        return breadth;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}
class Calculate extends ROOM{
    public double Area() {
        return (2*((getLength()*getBreadth())
                +(getBreadth()*getHeight())
                +(getHeight()*getLength())));
    }
    public double Volume() {
        return (getLength()*getBreadth()*getHeight());
    }
}
public class Area_and_Volume {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        Calculate C = new Calculate();
        System.out.print("Enter the Room Length  : ");
        C.setLength(S.nextDouble());
        System.out.print("Enter the Room Breadth : ");
        C.setBreadth(S.nextDouble());
        System.out.print("Enter the Room Height  : ");
        C.setHeight(S.nextDouble());
        System.out.println("Room's Area   : "+C.Area());
        System.out.println("Room's Volume : "+C.Volume());
    }
}